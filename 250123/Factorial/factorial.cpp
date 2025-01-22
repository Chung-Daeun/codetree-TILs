#include <iostream>

using namespace std;

int N;

int fac(int n) {
    if (n == 1){
        return 1;
    }

    return n * fac(n - 1);
}

int main() {
    cin >> N;

    // Write your code here!
    cout << fac(N);
    return 0;
}