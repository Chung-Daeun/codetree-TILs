#include <iostream>

using namespace std;

int a, b;

bool ThreeClap(int n) {
    switch(n / 10) {
        case 3: case 6: case 9:
            return true;
    }

    switch(n % 10) {
        case 3: case 6: case 9:
            return true;
        default:
            return false;
    }
}

bool ThreeNum(int n) {
    return (n % 3 == 0) || ThreeClap(n);
}

int main() {
    cin >> a >> b;

    // Write your code here!
    int cnt = 0;
    for (int i = a; i <= b; i++) {
        if (ThreeNum(i)) {
            cnt++;
        }
    }

    cout << cnt;

    return 0;
}