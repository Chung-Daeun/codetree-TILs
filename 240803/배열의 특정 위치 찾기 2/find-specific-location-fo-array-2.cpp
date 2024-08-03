#include <iostream>
using namespace std;

int main() {
    int arr[10];
    int sum1 = 0;
    int sum2 = 0;

    for(int i = 0; i < 10; i++){
        cin >> arr[i];

        if(i % 2 == 0){
            sum1 += arr[i];
        }
        else {
            sum2 += arr[i];
        }
    }

    cout << (sum1 - sum2 > 0? sum1 - sum2 : sum2 - sum1);
    return 0;
}