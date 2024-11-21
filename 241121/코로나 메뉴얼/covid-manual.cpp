#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int sum = 0;
    char sym;
    int temp;

    for(int i = 0; i < 3; i++){
        cin >> sym >> temp;

        if(sym == 'Y' && temp >= 37){
            sum++;
        }
    }

    if(sum >= 2){
        cout << "E";
    } else {
        cout << "N";
    }
    return 0;
}