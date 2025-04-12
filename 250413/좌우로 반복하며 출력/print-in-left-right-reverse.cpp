#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++) {
        if (i % 2 == 1) {
            for (int j = 1; j <= n; j++) {
                cout << j;
            }
            cout << endl;
        } else {
            for (int j = n; j >= 1; j--) {
                cout << j;
            }
            cout << endl;
        }
    }
    return 0;
}