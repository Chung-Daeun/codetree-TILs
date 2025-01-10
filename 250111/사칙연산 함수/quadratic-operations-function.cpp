#include <iostream>

using namespace std;

int a;
int c;
char o;

int new_add(int n1, int n2) {
    return n1 + n2;
}

int new_sub(int n1, int n2) {
    return n1 - n2;
}

int new_mul(int n1, int n2) {
    return n1 * n2;
}

int new_div(int n1, int n2) {
    return n1 / n2;
}

int main() {
    cin >> a >> o >> c;

    // Write your code here!
    switch(o){
        case '+':
            cout << a << " " << o << " " << c << " = " << new_add(a, c);
        break;
        case '-':
            cout << a << " " << o << " " << c << " = " << new_sub(a, c);
        break;
        case '*':
            cout << a << " " << o << " " << c << " = " << new_mul(a, c);
        break;
        case '/':
            cout << a << " " << o << " " << c << " = " << new_div(a, c);
        break;
        default:
            cout << "False";
    }
    return 0;
}