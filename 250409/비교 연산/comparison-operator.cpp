#include <iostream>
using namespace std;

int main() {
    // Please write your code here.

    int a, b;
    cin >> a >> b;

    bool b1 = a >= b;
    bool b2 = a > b;
    bool b3 = a <= b;
    bool b4 = a < b;
    bool b5 = a == b;
    bool b6 = a != b;

    cout << b1 << endl << b2 << endl << b3 << endl;
    cout << b4 << endl << b5 << endl << b6;
    return 0;
}