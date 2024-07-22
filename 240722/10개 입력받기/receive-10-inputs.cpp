#include <iostream>
using namespace std;

int main() {
    int arr[10];
    int sum = 0;
    int i = 0;

    for(i; i < 10; i++){
        cin >> arr[i];

        if(arr[i] == 0){
            break;
        }

        sum += arr[i];
    }

    cout << fixed;
    cout.precision(1);
    cout << sum << " ";
    if(i != 9){
        cout << (double)sum / i;
    } else {
        cout << (double)sum / 10;
    }
    
    return 0;
}