#include <iostream>

using namespace std;

int n;
int arr[100];

int max(int n, int k, int m) {
    if (n == k) {
        return m;
    }

    if (m < arr[k]){
        m = arr[k];
    }

    return max(n, k + 1, m);
}

int main() {
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Write your code here!
    cout << max(n, 0, 0);
    return 0;
}