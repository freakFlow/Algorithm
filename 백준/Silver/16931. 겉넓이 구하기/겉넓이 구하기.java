import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    static int N, M;
    static int[][] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];

        for(int r=0; r<N; r++){
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<M; c++){
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        ans = N * M * 2;

        for(int r=0; r<N; r++){
            for(int c=0; c<M; c++){

                for(int d=0; d<dr.length; d++){
                    int nr = r + dr[d];
                    int nc = c + dc[d];
                    if(isIn(nr, nc)) ans += Math.max(0, arr[r][c] - arr[nr][nc]);
                    else ans += arr[r][c];
                }
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<N && c>=0 && c<M;
    }

}