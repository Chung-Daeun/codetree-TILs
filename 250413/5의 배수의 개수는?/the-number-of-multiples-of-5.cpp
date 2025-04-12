#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int cnt = 0;

    int num;
    for (int i = 0; i < 16; i++) {
        cin >> num;
        if (num % 5 == 0) {
            cnt++;
        }
    }

    cout << cnt;
    return 0;
}