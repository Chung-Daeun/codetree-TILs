#include <iostream>

using namespace std;

int N;

void func1(int n) {
    if (n == 0) {
        return;
    }

    func1(n - 1);
    cout << n << " ";
}

void func2(int n) {
    if (n == 0) {
        return;
    }

    cout << n << " ";
    func2(n - 1);
}

int main() {
    cin >> N;

    // Write your code here!
    func1(N);
    cout << endl;
    func2(N);

    return 0;
}