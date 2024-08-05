#include <stdio.h>

int main(void){
    int N, M, K;
    scanf("%d%d%d", &N, &M, &K);

    int arr[N][M + 1];
    int find = 0;

    for(int n=0; n<N; n++){
        for(int m=0; m<M; m++){
            scanf("%d", &arr[n][m]);
        }
    }

    for(int m=0; m<M; m++){
        for(int n=0; n<N; n++){
            if(arr[n][m] >= K){
                printf("%d %d", n + 1, m + 1);
                find = 1;
                break;
            }
            arr[n][m + 1] += arr[n][m];
        }
        if(find == 1) break;
    }

    return 0;
}