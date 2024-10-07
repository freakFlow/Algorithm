#include <iostream>
using namespace std;

int main() {
    int N;
    char S[100];
    int start, ans = 0;

    cin >> N;
    for(int n=0; n<N; n++){
        cin >> S[n];
    }

    for(int n=0; n<N; n++){
        if(S[n] == 'A'){
            start = n;
            break;
        }
    }

    int findN = 0;
    for(int n=start+1; n<N; n++){
         if(S[n] == 'N'){
            findN++;
            continue;
         }

         if(S[n] == 'A'){
            if(findN == 1) ans++;
            findN = 0;
         }
    }

    cout << ans;

    return 0;
}