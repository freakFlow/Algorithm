import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int a, b;
    static int sIdx;
    static long[] segmentTree;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sIdx = (int)Math.pow(2, (int)Math.ceil(Math.log(N) / Math.log(2)));
        segmentTree = new long[sIdx * 2];

        for(int n=0; n<N; n++){
            segmentTree[sIdx + n] = Long.parseLong(br.readLine());
        }

        for(int i=sIdx - 1; i>0; i--){
            segmentTree[i] = Math.min(segmentTree[i * 2], segmentTree[i * 2 + 1]);
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            long min = Long.MAX_VALUE;

            a += sIdx - 1;
            b += sIdx - 1;
            while(a <= b){
                if(a % 2 == 1) min = Math.min(min, segmentTree[a]);
                if(b % 2 == 0) min = Math.min(min, segmentTree[b]);
                a = (a + 1) / 2;
                b = (b - 1) / 2;
            }

            sb.append(min).append('\n');
        }

        System.out.print(sb);
    }
}
