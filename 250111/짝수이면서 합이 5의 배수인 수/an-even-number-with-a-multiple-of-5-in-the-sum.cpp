#include <iostream>

using namespace std;

int n;

bool Func(int n) {
    return (n % 2 == 0) && (((n / 10) + (n % 10)) % 5 == 0);
}

int main() {
    cin >> n;

    // Write your code here!
    if (Func(n)) {
        cout << "Yes";
    } else {
        cout << "No";
    }

    return 0;
}