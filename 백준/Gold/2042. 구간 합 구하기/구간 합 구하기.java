import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M, K;
    static long a, b, c;
    static int index;
    static long[] segmentTree;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        index = (int)Math.pow(2, (int)Math.ceil(Math.log(N) / Math.log(2)));
        segmentTree = new long[index * 2];

        for(int n=0; n<N; n++){
            segmentTree[index + n] = Long.parseLong(br.readLine());
        }

        for(int i=index-1; i>0; i--){
            segmentTree[i] = segmentTree[2 * i] + segmentTree[2 * i + 1];
        }

        for(int i=0; i<M + K; i++){
            st = new StringTokenizer(br.readLine());
            a = Long.parseLong(st.nextToken());
            b = Long.parseLong(st.nextToken());
            c = Long.parseLong(st.nextToken());

            if(a == 1) update();
            else subTotal();
        }

        System.out.print(sb);
    }

    static void subTotal(){
        int startIdx = (int)b + index - 1;
        int endIdx = (int)c + index - 1;
        long sum = 0;

        while(startIdx <= endIdx){
            if(startIdx % 2 == 1) sum += segmentTree[startIdx];
            if(endIdx % 2 == 0) sum += segmentTree[endIdx];
            startIdx = (startIdx + 1) / 2;
            endIdx = (endIdx - 1) / 2;
        }

        sb.append(sum).append('\n');
    }

    static void update(){
        int idx = (int)b + index - 1;
        long diff = segmentTree[idx] - c;

        while(idx > 0){
            segmentTree[idx] -= diff;
            idx /= 2;
        }
    }
}
