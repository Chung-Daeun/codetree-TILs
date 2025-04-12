#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int arr[n][n];

    for (int j = 0; j < n; j++) {
        if (j % 2 == 0) {
            for (int i = 0; i < n; i++) {
                arr[i][j] = i + 1;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                arr[n - i][j] = i;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << arr[i][j];
        }
        cout << endl;
    }
    return 0;
}