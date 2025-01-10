#include <iostream>

using namespace std;

int n1, n2;
int a[100], b[100];

bool isContinue(int arr1[], int arr2[]) {
    for (int i = 0; i < n1; i++) {
        if (arr1[i] == arr2[0]) {

            if (n1 - i < n2) return false;

            for (int j = 1; j < n2; j++){
                if (arr1[i + j] != arr2[j])
                    return false;
            }
            return true;
        }
    }
    return false;
}
int main() {
    cin >> n1 >> n2;

    for (int i = 0; i < n1; i++) cin >> a[i];

    for (int i = 0; i < n2; i++) cin >> b[i];

    // Write your code here!
    if (isContinue(a, b)) {
        cout << "Yes";
    } else {
        cout << "No";
    }
    return 0;
}