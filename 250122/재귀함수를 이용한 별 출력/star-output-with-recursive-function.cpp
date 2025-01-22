#include <iostream>

using namespace std;

int n;

void makeStar(int n) {
    if (n == 0) {
        return;
    }

    makeStar(n - 1);
    for (int i = 0; i < n; i++) {
        cout << "*";
    }
    cout << endl;
}

int main() {
    cin >> n;

    // Write your code here!
    makeStar(n);
    return 0;
}