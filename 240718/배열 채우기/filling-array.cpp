#include <iostream>
using namespace std;

int main() {
    int arr[10];
    int i = 0;

    for(i; i < 10; i++){
        cin >> arr[i];
        if(arr[i] == 0){
            break;
        }
    }

    for(i = i - 1; i >= 0; i--){
        cout << arr[i] << " ";
    }
    return 0;
}