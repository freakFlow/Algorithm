#include <iostream>

using namespace std;

int N, Q;
long long arr[10001];
int cmd, a, b;

int main() {
    cin >> N >> Q;

    for(int q=0; q<Q; q++){
        cin >> cmd >> a >> b;
        if(cmd == 1){
            for(int n=a; n<=N; n++){
                arr[n] += b;
            }
        }else if(cmd == 2){
            long long diff = arr[b] - arr[a - 1];
            cout << diff << endl;
        }
    }
    
    return 0;
}