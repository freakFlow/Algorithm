import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int MAX = 1_000_000, DIV = 1_000_000_007;

    static int N;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new long[MAX + 1][2];

        dp[0][0] = 1;
        dp[1][0] = 2;
        dp[2][0] = 7;
        dp[3][0] = 22;
        dp[3][1] = 2;

        for(int i=4; i<=MAX; i++){
            long result = (dp[i-1][1] + dp[i-3][0] * 2) % DIV;
            dp[i][1] = result;
            result += (2 * dp[i-1][0] + 3 * dp[i-2][0]) % DIV;
            dp[i][0] = result % DIV;
        }

        sb.append(dp[N][0]);

        System.out.print(sb);
    }
}