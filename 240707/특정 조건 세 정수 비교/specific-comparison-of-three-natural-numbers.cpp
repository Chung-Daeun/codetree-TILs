#include <iostream>
using namespace std;

int main() {
    int a, b, c;
    cin >> a >> b >> c;

    int min = (a < b)?
                (a < c)?
                    a : c
                 :
                (b < c)?
                    b : c;

    if(a == min){
        cout << 1 << " ";
    } else {
        cout << 0 << " ";
    }

    if(a == b && b == c){
        cout << 1;
    } else {
        cout << 0;
    }
    return 0;
}