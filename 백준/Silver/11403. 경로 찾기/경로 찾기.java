import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int INF = 999_999_999;
    static int N;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                arr[i][j] = INF;
            }
        }

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                if(st.nextToken().equals("1")) arr[i][j] = 1;
            }
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
                if(arr[i][j] == INF || arr[i][j] == 0) sb.append(0);
                else sb.append(1);
                sb.append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

}
