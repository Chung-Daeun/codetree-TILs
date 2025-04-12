#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    string st1, st2;
    cin >> st1 >> st2;

    if (st1.length() == st2.length()) {
        cout << "same";
    } else if (st1.length() > st2.length()) {
        cout << st1 << " " << st1.length();
    } else {
        cout << st2 << " " << st2.length();
    }
    return 0;
}