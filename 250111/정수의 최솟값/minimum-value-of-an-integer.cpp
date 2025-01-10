#include <iostream>

using namespace std;

int a, b, c;

int min(int a, int b, int c){
    int ans = a;

    if (ans > b){
        ans = b;
    }

    if (ans > c){
        ans = c;
    }

    return ans;
}

int main() {
    cin >> a >> b >> c;

    // Write your code here!
    cout << min(a, b, c);
    
    return 0;
}