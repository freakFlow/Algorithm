import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int M, H;
    static int N;
    static int C, B;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if(C * M > B * H) answer += C * M;
            else answer += B * H;
        }

        System.out.print(answer);
    }

}
