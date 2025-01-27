#include <iostream>

using namespace std;

int n;

int ans(int num) {
    if (num == 1) {
        return 0;
    }

    if (num % 2 == 0) {
        return 1 + ans(num / 2);
    }

    return 1 + ans(num * 3 + 1);
}

int main() {
    cin >> n;

    // Write your code here!
    cout << ans(n);
    return 0;
}