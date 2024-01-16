import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, K;
    static int[] coins;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        coins = new int[N];
        for(int n=0; n<N; n++){
            coins[n] = Integer.parseInt(br.readLine());
        }

        for(int n=N-1; n>=0; n--){
            answer += K / coins[n];
            K %= coins[n];
        }

        System.out.print(answer);
    }

}
