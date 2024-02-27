import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int DIV = 1_000_000_007;
    static int N, M, K;
    static int a, b, c;
    static int sIdx;
    static int[] segmentTree;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        sIdx = (int)Math.pow(2, (int)Math.ceil(Math.log(N) / Math.log(2)));
        segmentTree = new int[sIdx * 2];

        for(int n=0; n<N; n++){
            segmentTree[sIdx + n] = Integer.parseInt(br.readLine());
        }

        for(int i=sIdx-1; i>0; i--){
            segmentTree[i] = (int)((long)segmentTree[i * 2] * segmentTree[i * 2 + 1] % DIV);
        }

        for(int i=0; i<M + K; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(a == 1) update();
            else getAns();
        }

        System.out.print(sb);
    }

    static void update(){
        b += sIdx - 1;
        segmentTree[b] = c;
        b /= 2;
        while(b > 0){
            segmentTree[b] = (int)((long)segmentTree[b * 2] * segmentTree[b * 2 + 1] % DIV);
            b /= 2;
        }
    }

    static void getAns(){
        b += sIdx - 1;
        c += sIdx - 1;
        int ans = 1;

        while(b <= c){
            if(b % 2 == 1) ans = (int)((long)ans * segmentTree[b] % DIV);
            if(c % 2 == 0) ans = (int)((long)ans * segmentTree[c] % DIV);
            b = (b + 1) / 2;
            c = (c - 1) / 2;
        }
        sb.append(ans).append('\n');
    }
}
