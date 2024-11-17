#include <iostream>
using namespace std;

int main() {
    int N, M;
    int arr[1001][1001];

    cin >> N >> M;

    for(int n=1; n<=N; n++){
        cin >> arr[n][0];
    }

    for(int m=1; m<=M; m++){
        cin >> arr[0][m];
    }

    for(int n=1; n<=N; n++){
        for(int m=1; m<=M; m++){
            if(arr[n-1][m] == arr[n][m-1]) arr[n][m] = 0;
            else arr[n][m] = 1;
        }
    }

    cout << arr[N][M];

    return 0;
}