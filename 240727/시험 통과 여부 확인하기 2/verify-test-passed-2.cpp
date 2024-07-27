#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int stu[n] = {0};
    int score;
    int cnt = 0;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < 4; j++){
            cin >> score;
            stu[i] += score;
        }

        if(stu[i] / 4 >= 60){
            cout << "pass" << endl;
            cnt++;
        } else { 
            cout << "fail" << endl;
        }
    }

    cout << cnt;
    
    return 0;
}