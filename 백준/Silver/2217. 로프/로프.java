import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N;
    static int[] rope;
    static int ans;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        rope = new int[N];

        for(int n=0; n<N; n++){
            rope[n] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        for(int n=0; n<N; n++){
            ans = Math.max(ans, rope[n] * (N - n));
        }

        sb.append(ans);

        System.out.print(sb);
    }

}