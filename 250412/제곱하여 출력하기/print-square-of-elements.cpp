#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    int arr[n];
    int temp;
    for (int i = 0; i < n; i++) {
        cin >> temp;
        arr[i] = temp * temp;
    }

    for (int x : arr) {
        cout << x << " ";
    }


    return 0;
}