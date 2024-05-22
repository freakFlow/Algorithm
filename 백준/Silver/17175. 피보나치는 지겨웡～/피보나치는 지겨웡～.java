import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int DIV = 1_000_000_007;
    static final int SIZE = 50;

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[SIZE + 1];
        arr[0] = 1;
        arr[1] = 1;

        for(int n=2; n<=N; n++){
            long sum = arr[n-2] + arr[n-1] + 1;

            arr[n] = (int)(sum % DIV);
        }

        sb.append(arr[N]);

        System.out.print(sb);
    }
}