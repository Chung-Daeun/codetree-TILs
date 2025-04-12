#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int arr[10];

    for (int i = 0; i < 10; i++) {
        cin >> arr[i];
    }

    int cnt3 = 0;
    int cnt5 = 0;

    for (int x : arr) {
        if (x % 3 == 0) {
            cnt3 += 1;
        }

        if (x % 5 == 0) {
            cnt5 += 1;
        }
    }

    cout << cnt3 << " " << cnt5;
    return 0;
}