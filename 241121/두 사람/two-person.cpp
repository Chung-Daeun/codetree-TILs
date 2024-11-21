#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int age[2];
    char gender[2];

    for(int i = 0; i < 2; i++){
        cin >> age[i];
        cin >> gender[i];
    }

    if((age[0] >= 19 && gender[0] == 'M') || (age[1] >= 19 && gender[1] == 'M')){
        cout << 1;
    } else {
        cout << 0;
    }
    return 0;
}