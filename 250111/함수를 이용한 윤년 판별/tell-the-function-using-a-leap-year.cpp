#include <iostream>

using namespace std;

int y;

bool isLunarYear(int year) {
    if ((year % 100 == 0) && (year % 400 != 0))
        return false;
    if (year % 4 == 0)
        return true;

    return false;
}
int main() {
    cin >> y;

    // Write your code here!
    cout << boolalpha <<isLunarYear(y);
    return 0;
}