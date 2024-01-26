import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M, L, Z;
    static int answer;

    public static void main(String[] args) throws IOException {
        Z = Integer.parseInt(br.readLine());

        for(int z=0; z<Z; z++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            answer = N / M;
            int remain = N % M;
            if(remain > 0){
                if(L == 1 || (remain - 1 + L) > M) answer++;
            }

            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }

}
