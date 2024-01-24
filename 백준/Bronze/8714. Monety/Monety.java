import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] count;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        count = new int[2];

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<N; n++){
            count[Integer.parseInt(st.nextToken())]++;
        }

        sb.append(Math.min(count[0], count[1]));

        System.out.print(sb);
    }

}
