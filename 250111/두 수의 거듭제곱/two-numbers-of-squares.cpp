#include <iostream>

using namespace std;

int a, b;

int pow(int a, int b) {
    int ans = 1;

    for(int i = 0; i < b; i++){
        ans *= a;
    }

    return ans;
}
int main() {
    cin >> a >> b;

    // Write your code here!
    cout << pow(a, b);

    return 0;
}