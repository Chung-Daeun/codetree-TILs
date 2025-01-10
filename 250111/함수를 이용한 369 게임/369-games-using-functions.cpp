#include <iostream>

using namespace std;

int a, b;

bool ThreeClap(int n) {
    for (int i = n; i > 0; i /= 10) {
        switch(i % 10) {
            case 3: case 6: case 9:
                return true;
            default:
                continue;
        }
    }

    return false;
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