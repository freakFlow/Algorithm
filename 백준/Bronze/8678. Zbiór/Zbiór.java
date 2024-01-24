import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int a, b;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(b % a == 0) sb.append("TAK");
            else sb.append("NIE");
            sb.append('\n');
        }

        System.out.print(sb);
    }

}
