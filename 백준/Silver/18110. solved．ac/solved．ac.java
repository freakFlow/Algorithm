import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] arr;
    static int cut;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        cut = (int)Math.round(N * 0.15);
        arr = new int[N];

        for(int n=0; n<N; n++){
            arr[n] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int sum = 0;
        for(int n=cut; n<N-cut; n++){
            sum += arr[n];
        }
        sb.append(Math.round(sum / (double)(N - 2 * cut)));

        System.out.print(sb);
    }
}