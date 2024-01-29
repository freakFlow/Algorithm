import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int INF = 999_999_999;
    static int N, M;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i != j) arr[i][j] = INF;
            }
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr[s][e] = Math.min(arr[s][e], w);
        }

        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
                }
            }
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i == j || arr[i][j] == INF) sb.append(0);
                else sb.append(arr[i][j]);
                sb.append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

}
