#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int arr[9] = { 0, };
    int num;
    for(int i = 0; i < n; i++){
        cin >> num;
        arr[num - 1]++;
    }

    for(int i = 0; i < 9; i++){
        cout << arr[i] << endl;
    }
    return 0;
}