#include <iostream>

using namespace std;

int M, D;

bool isReal(int m, int d) {
    switch(m) {
        case 1: case 3: case 5: case 7:
        case 8: case 10: case 12:
            if (d > 31)
                return false;
        break;
        
        case 2:
            if (d > 28)
                return false;
        break;

        case 4: case 6: case 9: case 11:
            if (d > 30)
                return false;
        break;
        default:
            return false;
    }

    return true;
}
int main() {
    cin >> M >> D;

    // Write your code here!
    if (isReal(M, D)) {
        cout << "Yes";
    } else {
        cout << "No";
    }
    return 0;
}