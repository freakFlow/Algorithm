import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T;
    static int N;
    static int before;
    static int block;
    static int maxUp, maxDown;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++){
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            before = Integer.parseInt(st.nextToken());
            maxUp = maxDown = 0;

            for(int n=1; n<N; n++){
                block = Integer.parseInt(st.nextToken());
                if(before < block) maxUp = Math.max(maxUp, block - before);
                else maxDown = Math.max(maxDown, before - block);
                before = block;
            }

            sb.append('#').append(t).append(' ').append(maxUp).append(' ').append(maxDown).append('\n');
        }

        System.out.print(sb);
    }

}