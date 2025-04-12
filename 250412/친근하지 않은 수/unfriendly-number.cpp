#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int ans = 0;
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
            continue;
        }

        ans += 1;
    }

    cout << ans;
    return 0;
}