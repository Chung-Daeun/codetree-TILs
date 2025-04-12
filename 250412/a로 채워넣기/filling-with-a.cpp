#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    string st;
    cin >> st;

    st[1] = 'a';
    st[st.length() - 2] = 'a';
    cout << st;
    return 0;
}