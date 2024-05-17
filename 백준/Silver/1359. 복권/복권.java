import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, M, K;
    static double ans;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int fail = 0;
        for(int k=0; k<K; k++){
            fail += Comb(N - M, M - k) * Comb(M, k);
        }

        ans = 1 - (double)fail / Comb(N, M);

        System.out.print(ans);
    }

    static int Comb(int n, int r){
        if(n < r) return 0;
        if(r == 0) return 1;
        if(r == 1) return n;

        return Comb(n-1, r) + Comb(n-1, r-1);
    }
}