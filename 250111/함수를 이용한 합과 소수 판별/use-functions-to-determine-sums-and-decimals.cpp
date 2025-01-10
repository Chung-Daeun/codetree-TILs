#include <iostream>
#include <cmath>
using namespace std;

int a, b;

bool isPrime(int n) {
    if (n == 1) return false;

    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0)
            return false;
    }
    
    return true;
}

bool evenSum(int n) {
    int sum = 0;

    while (n > 0) {
        sum += (n % 10);
        n /= 10;
    }

    return sum % 2 == 0;
}
int main() {
    cin >> a >> b;

    // Write your code here!
    int cnt = 0;
    for (int i = a; i <= b; i++) {
        if (isPrime(i) && evenSum(i)){
            cnt++;
        }
    }

    cout << cnt;

    return 0;
}