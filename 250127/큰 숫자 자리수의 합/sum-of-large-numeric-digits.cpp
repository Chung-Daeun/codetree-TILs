#include <iostream>

using namespace std;

int a, b, c;

int ans(long num) {
    if (num < 10) {
        return num;
    }

    return (num % 10) + ans(num / 10);
}
int main() {
    cin >> a >> b >> c;

    // Write your code here!
    long num = a * b * c;

    cout << ans(num);
    return 0;
}