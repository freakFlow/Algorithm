import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static long K;
    static long[] sum;
    static HashMap<Long, Integer> hm;
    static long ans;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Long.parseLong(st.nextToken());
        sum = new long[N+1];
        hm = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int n=1; n<=N; n++){
            sum[n] = Long.parseLong(st.nextToken()) + sum[n-1];
        }

        for(int n=1; n<=N; n++) {
            if (sum[n] == K) ans++;

            ans += hm.getOrDefault(sum[n] - K, 0);

            hm.put(sum[n], hm.getOrDefault(sum[n], 0) + 1);
        }

        sb.append(ans);

        System.out.print(sb);
    }
}