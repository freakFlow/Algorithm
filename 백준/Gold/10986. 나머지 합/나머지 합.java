import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] sum;
    static long[] remainCnt;
    static long answer;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sum = new int[N+1];
        remainCnt = new long[M];
        answer = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            sum[i] = (sum[i-1] + Integer.parseInt(st.nextToken()) % M) % M;
            if(sum[i] == 0) answer++;
            remainCnt[sum[i]]++;
        }

        for(int i=0; i<M; i++){
            if(remainCnt[i] < 2) continue;

            answer += remainCnt[i] * (remainCnt[i] - 1) / 2;
        }

        System.out.print(answer);
    }
}
