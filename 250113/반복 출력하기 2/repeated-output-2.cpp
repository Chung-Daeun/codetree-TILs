#include <iostream>

using namespace std;

int N;

void Print(int n) {
    if (n == 0) {
        return;
    }

    Print(n - 1);
    cout << "HelloWorld" << endl;
}

int main() {
    cin >> N;

    // Write your code here!

    Print(N);
    return 0;
}