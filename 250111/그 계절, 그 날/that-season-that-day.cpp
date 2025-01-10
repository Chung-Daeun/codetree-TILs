#include <iostream>
// #include <string>
using namespace std;

int Y, M, D;

bool LunarYear(int year) {
    if (year % 4 != 0)
        return false;

    if (year % 100 == 0) {
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    return true;
}

bool isReal(int year, int month, int day) {
    switch(month) {
        case 1: case 3: case 5: case 7:
        case 8: case 10: case 12:
            if (day > 31) {
                return false;
            }
        break;

        case 4: case 6: case 9: case 11:
            if (day > 30) {
                return false;
            }
        break;

        case 2:
            if (day > 29) {
                return false;
            } else if (!LunarYear(year) && day == 29) {
                return false;
            }
        break;
        default:
            return false;
    }

    return true;
}

string season(int year, int month, int day) {
    if (!isReal(year, month, day)) {
        return "-1";
    }

    switch(month) {
        case 3: case 4: case 5:
            return "Spring";
        case 6: case 7: case 8:
            return "Summer";
        case 9: case 10: case 11:
            return "Fall";
        case 12: case 1: case 2:
            return "Winter";
    }
}
int main() {
    cin >> Y >> M >> D;

    // Write your code here!
    cout << season(Y, M, D);
    return 0;
}