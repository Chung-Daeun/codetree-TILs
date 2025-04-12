#include <iostream>
#include <cmath>
using namespace std;

int start, endv;

int main() {
    cin >> start >> endv;

    // Please write your code here.
    int ans = 0;
    int cnt;
    for (int i = start; i <= endv; i++) {
        if ((int)sqrt(i) == sqrt(i)) {
            cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt += 1;
                    if (cnt > 3) {
                        break;
                    }
                }
            }

            if (cnt == 3) {
                ans += 1;
            }
        }
    }

    cout << ans;

    return 0;
}
