import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int K, N;
    static long[] arr;
    static long ans;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new long[K];

        for(int k=0; k<K; k++){
            arr[k] = Long.parseLong(br.readLine());
        }

        long left = 0;
        long right = Integer.MAX_VALUE;
        long mid;

        while(left <= right){
            mid = (left + right) / 2;

            if(check(mid)){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static boolean check(long num){
        int count = 0;

        for(long line : arr){
            count += (int)(line / num);
        }

        return count >= N;
    }
}