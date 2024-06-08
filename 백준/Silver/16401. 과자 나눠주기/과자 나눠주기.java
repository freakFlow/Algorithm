import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int M, N;
    static int[] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<N; n++){
            arr[n] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 1, right = arr[N-1], mid = 0;

        while(left <= right){
            mid = (left + right) / 2;
            if(freeTime(mid)){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static boolean freeTime(int length){
        int count = 0;
        for(int i=0; i<N; i++){
            count += arr[i] / length;
        }

        return count >= M;
    }
}