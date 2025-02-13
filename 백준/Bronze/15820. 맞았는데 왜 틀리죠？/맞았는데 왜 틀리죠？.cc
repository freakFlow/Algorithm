#include <iostream>
#include <algorithm>
using namespace std;

int S1, S2;
int test, ans;
bool passSample = true, passAll = true;;

int main() {
    cin >> S1 >> S2;

    for(int s=0; s<S1; s++){
        cin >> test >> ans;
        if(test != ans) passSample = false;
    }

    for(int s=0; s<S2; s++){
        cin >> test >> ans;
        if(test != ans) passAll = false;
    }

    if(!passSample) cout << "Wrong Answer";
    else if(passAll) cout << "Accepted";
    else cout << "Why Wrong!!!";
    
    return 0;
}