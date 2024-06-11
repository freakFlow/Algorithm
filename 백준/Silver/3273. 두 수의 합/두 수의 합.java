import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int MAX = 1_000_000;

    static int N, X;
    static int[] arr;
    static int[] idx;
    static int ans;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        idx = new int[MAX + 1];

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<N; n++){
            arr[n] = Integer.parseInt(st.nextToken());
            idx[arr[n]] = n;
        }

        X = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            int diff = X - arr[n];
            if(diff > 0 && diff <= MAX && idx[diff] > n) ans++;
        }

        sb.append(ans);

        System.out.print(sb);
    }
}