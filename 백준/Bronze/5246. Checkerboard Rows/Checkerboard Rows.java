import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] rows;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            rows = new int[9];
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            for(int i=0; i<num; i++){
                st.nextToken();
                rows[Integer.parseInt(st.nextToken())]++;
            }

            Arrays.sort(rows);
            sb.append(rows[8]).append('\n');
        }

        System.out.print(sb);
    }


}
