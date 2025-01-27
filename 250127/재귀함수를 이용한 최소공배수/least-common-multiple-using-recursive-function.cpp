#include <iostream>

using namespace std;

int n;
int arr[10];

int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }

    return gcd(b, a % b);
}

int lcm(int a, int b) {
    if (a < b) {
        return (a * b) / gcd(b, a);
    }

    return (a * b) / gcd(a, b);
}

int main() {
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Write your code here!
    int num = arr[0];
    for (int i = 1; i < n; i++) {
        num = lcm(num, arr[i]);
    }

    cout << num;
    return 0;
}