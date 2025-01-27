#include <iostream>

using namespace std;

int N;

int Weird(int num) {
    if (num == 1) {
        return 1;
    }

    if (num == 2) {
        return 2;
    }

    return Weird(num / 3) + Weird(num - 1);
}

int main() {
    cin >> N;

    // Write your code here!
    cout << Weird(N);
    return 0;
}