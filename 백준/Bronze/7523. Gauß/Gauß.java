import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T;
    static int N, M;
    static long answer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            sb.append("Scenario #").append(t).append(":\n").append(getTotal(N, M)).append("\n\n");
        }

        System.out.print(sb);
    }

    static long getTotal(long n, long m){
        long size = Math.abs(m - n) + 1;
        return size * (n + m) / 2;
    }
}
