#include <iostream>
#include <algorithm>

using namespace std;

int N;
int arr[100000];
int ans;

int main() {
    cin >> N;

    for(int n=0; n<N; n++){
        cin >> arr[n];
    }

    sort(arr, arr + N);

    int idx = 0;
    if(N % 2 == 0){
        while(idx < N / 2 - 1){
            ans += arr[N - idx - 1] - arr[idx];
            idx++;
        }
        idx++;
    }else{
        while(idx < N / 2){
            ans += arr[N - idx - 1] - arr[idx];
            idx++;
        }
    }

    ans += arr[idx];

    cout << ans;
    
    return 0;
}