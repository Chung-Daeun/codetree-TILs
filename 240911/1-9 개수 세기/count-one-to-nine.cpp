#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int arr[n] = {0,};
    int num;
    for(int i = 0; i < n; i++){
        cin >> num;
        arr[num]++;
    }

    for(int i = 0; i < 9; i++){
        cout << arr[num] << endl;
    }
    return 0;
}