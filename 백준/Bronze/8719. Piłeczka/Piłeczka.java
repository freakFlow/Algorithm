import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int x, w;
    static int bounce;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());

            bounce = 0;
            for(long i=x; i<w; i *= 2){
                bounce++;
            }

            sb.append(bounce).append('\n');
        }

        System.out.print(sb);
    }

}
