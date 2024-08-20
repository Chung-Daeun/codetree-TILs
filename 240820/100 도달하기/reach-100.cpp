#include <iostream>
using namespace std;

int main() {
    int arr[100];
    arr[0] = 1;
    cin >> arr[1];

    cout << arr[0] << " " << arr[1] << " ";

    for(int i = 2; i < 100; i++){
        arr[i] = arr[i - 2] + arr[i - 1];
        cout << arr[i] << " ";

        if(arr[i] > 100){
            break;
        }
    }
    
    return 0;
}