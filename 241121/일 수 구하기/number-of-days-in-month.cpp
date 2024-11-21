#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int mon;
    cin >> mon;

    switch(mon){
        case 1: case 3: case 5:
        case 7: case 8: case 10: case 12:
        cout << 31;
        break;

        case 2:
        cout << 28;
        break;

        default:
        cout << 30;
    }
    return 0;
}