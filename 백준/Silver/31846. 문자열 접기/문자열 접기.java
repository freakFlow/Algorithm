import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static String S;
    static int Q, l, r;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        S = br.readLine();
        Q = Integer.parseInt(br.readLine());

        for(int q=0; q<Q; q++){
            st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken()) - 1;
            r = Integer.parseInt(st.nextToken()) - 1;
            int max = 0;

            for(int fold=1; fold<N; fold++){
                int matched = 0;
                int left = fold-1;
                int right = fold;
                while(left>=l && right<=r){
                    if(S.charAt(left--) == S.charAt(right++)) matched++;
                }

                max = Math.max(max, matched);
            }

            sb.append(max).append('\n');
        }

        System.out.print(sb);
    }
}