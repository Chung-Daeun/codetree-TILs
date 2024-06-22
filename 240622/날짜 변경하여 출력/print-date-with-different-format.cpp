#include <iostream>
using namespace std;

int main() {
    // 입력받기
    int year, month, day;
    cin >> year;
    cin.get();
    cin >> month;
    cin.get();
    cin >> day;

    // 출력
    cout << month << "-" << day << "-" << year;
    return 0;
}