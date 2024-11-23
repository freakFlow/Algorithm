#include <iostream>
#include <queue>
using namespace std;

int dr[] = {0, 1, 0, -1};
int dc[] = {1, 0, -1, 0};

int N, M, R;
int arr[101][101];
bool toppled[101][101];
queue<pair<int, int>> q;
int ans;

int toDir(char dir){
    switch(dir){
        case 'E':
            return 0;
        case 'S':
            return 1;
        case 'W':
            return 2;
        case 'N':
            return 3;
    }
    return 0;
}

bool isIn(int r, int c){
    return r>0 && r<=N && c>0 && c<=M;
}

int main() {
    cin >> N >> M >> R;

    for(int n=1; n<=N; n++){
        for(int m=1; m<=M; m++){
            cin >> arr[n][m];
        }
    }

    for(int r=0; r<R; r++){
        int score = 0;
        int sr, sc, d;
        char dir;
        
        cin >> sr >> sc >> dir;
        d = toDir(dir);

        q.push({sr, sc});

        while(!q.empty()){
            int r = q.front().first;
            int c = q.front().second;
            q.pop();

            if(toppled[r][c]) continue;
            toppled[r][c] = true;
            score++;

            for(int k=1; k<arr[r][c]; k++){
                int nr = r + dr[d] * k;
                int nc = c + dc[d] * k;

                if(isIn(nr, nc) && !toppled[nr][nc]) q.push({nr, nc});
            }
        }

        ans += score;

        cin >> sr >> sc;

        toppled[sr][sc] = false;
    }

    cout << ans << endl;
    for(int n=1; n<=N; n++){
        for(int m=1; m<=M; m++){
            cout << (toppled[n][m] ? "F " : "S ");
        }
        cout << endl;
    }

    return 0;
}