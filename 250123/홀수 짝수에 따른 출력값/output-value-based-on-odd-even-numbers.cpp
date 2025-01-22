#include <iostream>

using namespace std;

int N;

int sum(int n) {
    if (n == 1 || n == 2){
        return n;
    }

    return n + sum(n - 2);
}

int main() {
    cin >> N;

    // Write your code here!
    cout << sum(N);
    return 0;
}