#include <iostream>

using namespace std;

int N;

int ans(int num) {
    if (num == 1) {
        return 2;
    }

    if (num == 2) {
        return 4;
    }

    return ans(num - 2) * ans(num - 1) % 100;
}

int main() {
    cin >> N;

    // Write your code here!

    cout << ans(N);
    return 0;
}