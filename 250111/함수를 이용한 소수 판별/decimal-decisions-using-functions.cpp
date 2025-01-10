#include <iostream>
#include <cmath>
using namespace std;

int a, b;

bool prime(int n) {
    for (int i = 2; i <= static_cast<int>(sqrt(n)) + 1; i++){
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
int main() {
    cin >> a >> b;

    // Write your code here!
    int sum = 0;
    for (int i = a; i <= b; i++) {
        if (prime(i)) {
            sum += i;
        }
    }

    cout << sum;
    return 0;
}