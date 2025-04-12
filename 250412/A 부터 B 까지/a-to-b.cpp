#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b;
    cin >> a >> b;

    int num = a;
    while (1) {
        cout << num << " ";

        if (num % 2 != 0) {
            num *= 2;
        } else {
            num += 3;
        }

        // 종료조건
        if (num > b) {
            break;
        }
    }
    return 0;
}