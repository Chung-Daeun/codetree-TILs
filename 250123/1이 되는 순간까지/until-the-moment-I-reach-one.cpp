#include <iostream>

using namespace std;

int N;

int work(int n) {
    if (n == 1) {
        return 0;
    }

    if (n % 2 == 0) {
        return work(n / 2) + 1;
    }

    return work(n / 3) + 1;
}

int main() {
    cin >> N;

    // Write your code here!
    cout << work(N);
    return 0;
}