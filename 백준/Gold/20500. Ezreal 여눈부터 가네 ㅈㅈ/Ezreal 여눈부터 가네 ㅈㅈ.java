import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int DIV = 1_000_000_007, MAX = 1515;

    static int N;
    static long ans;
    static long[][] comb;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        comb = new long[MAX+1][MAX+1];

        for(int five=0; five<N; five++){
            if((N - 1 + five) % 3 == 1){
                ans = (ans + combination(N-1, five)) % DIV;
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static long combination(int n, int r){
        if(n < r) return 0;
        if(n == r || n == 0 || r == 0) return 1;
        if(comb[n][r] > 0) return comb[n][r];
        return comb[n][r] = (combination(n-1, r) % DIV + combination(n-1, r-1) % DIV) % DIV;
    }
}