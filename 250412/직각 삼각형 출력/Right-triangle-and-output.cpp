#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int num = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= num; j++) {
            cout <<"*";
        }
        cout << endl;
        num += 2;
    }
    return 0;
}