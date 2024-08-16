import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int n=1; n<=N; n++){
            arr[n] = Integer.parseInt(st.nextToken()) + arr[n-1];
        }

        for(int j=1; j<=N; j++){
            for(int i=0; i<j; i++){
                if(arr[j] - arr[i] == M) ans++;
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }
}