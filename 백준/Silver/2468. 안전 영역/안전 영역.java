import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    static int N;
    static int[][] arr;
    static int ans;

    static boolean[][] visited;
    static int max;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        ans = 1;

        for(int r=0; r<N; r++){
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<N; c++){
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int rain=1; rain<=100; rain++){
            visited = new boolean[N][N];
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(arr[r][c] <= rain) visited[r][c] = true;
                }
            }

            max = 0;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(visited[r][c]) continue;
                    max++;
                    visited[r][c] = true;
                    dfs(r, c);
                }
            }
            if(max == 0) break;

            ans = Math.max(ans, max);
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static void dfs(int r, int c){
        for(int d=0; d<dr.length; d++){
            int nr = r + dr[d];
            int nc = c + dc[d];

            if(isIn(nr, nc) && !visited[nr][nc]){
                visited[nr][nc] = true;
                dfs(nr, nc);
            }
        }
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<N && c>=0 && c<N;
    }
}