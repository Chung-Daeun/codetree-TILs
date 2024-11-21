#include <iostream>
using namespace std;

int main() {
    int math[2];
    int eng[2];

    for(int i = 0; i < 2; i++){
        cin >> math[i];
        cin >> eng[i];
    }

    if(math[0] > math[1]){
        cout << "A";
    } else if (math[0] < math[1]){
        cout << "B";
    } else {
        if(eng[0] > eng[1]){
            cout << "A";
        } else {
            cout << "B";
        }
    }
    return 0;
}