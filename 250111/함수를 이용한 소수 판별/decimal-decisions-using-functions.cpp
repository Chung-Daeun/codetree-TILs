#include <iostream>
#include <cmath>
using namespace std;

int a, b;

bool prime(int n) {

    if (n == 1) return false;
    for (int i = 2; i <= sqrt(n); i++){
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