import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] price;
    static int[] min;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        price = new int[N + 1];
        min = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int n=1; n<=N; n++){
            price[n] = Integer.parseInt(st.nextToken());
        }

        for(int n=1; n<=N; n++){
            min[n] = price[n];
            for(int i=1; i<n; i++) {
                min[n] = Math.min(min[n], price[i] + min[n - i]);
            }
        }

        sb.append(min[N]);

        System.out.print(sb);
    }
}