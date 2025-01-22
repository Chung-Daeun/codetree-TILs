#include <iostream>

using namespace std;

int N;

void re(int n) {
    if (n == 0) {
        return;
    }

    cout << n << " ";
    re(n - 1);
    cout << n << " ";
}

int main() {
    cin >> N;

    // Write your code here!
    re(N);
    return 0;
}