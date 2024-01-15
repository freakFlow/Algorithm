import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T, N, sum;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            sum = 0;

            for(int n=0; n<N; n++){
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append(sum).append('\n');
        }

        System.out.print(sb);
    }

}
