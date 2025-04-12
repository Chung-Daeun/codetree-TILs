#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    string arr[5] = {"apple", "banana", "grape", "blueberry", "orange"};

    char ch;
    cin >> ch;

    int total = 0;
    for (string st : arr) {
        if (st[2] == ch || st[3] == ch) {
            cout << st << endl;
            total += 1;
        }
    }

    cout << total;
    return 0;
}