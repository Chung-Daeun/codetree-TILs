#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int arr[10];
    int cnt = 0;

    for(int i = 1; i <= 10; i++){
        arr[i] = n * i;
        cout << arr[i] << " ";

        if(arr[i] % 5 == 0) {
            cnt++;
            if(cnt == 2){
                break;
            }
        }
    }
    return 0;
}