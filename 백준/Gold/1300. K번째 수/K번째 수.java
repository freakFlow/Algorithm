import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, K;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        int start = 1;
        int end = K;

        while(start <= end){
            int mid = (start + end) / 2;
            int cnt = 0;

            for(int i=1; i<=N; i++){
                cnt += Math.min(mid / i, N);
            }

            if(cnt < K){
                start = mid + 1;
            }else{
                end = mid - 1;
                answer = mid;
            }
        }

        System.out.print(answer);
    }

}
