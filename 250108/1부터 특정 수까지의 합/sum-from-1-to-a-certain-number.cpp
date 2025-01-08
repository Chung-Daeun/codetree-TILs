#include <iostream>

using namespace std;

int N;

int func(int n){
    int ans = 0;
    for (int i = 1; i <= n; i++){
        ans += i;
    }
    return ans / 10;
}

int main() {
    cin >> N;

    // Write your code here!

    cout << func(N);

    return 0;
}