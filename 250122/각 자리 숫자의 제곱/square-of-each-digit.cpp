#include <iostream>

using namespace std;

int N;

int func(int n) {
    if (n < 10) {
        return n * n;
    }

    return func(n / 10) + (n % 10) * (n % 10);
}

int main() {
    cin >> N;

    // Write your code here!
    cout << func(N);
    return 0;
}