import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int start = max;
        int end = sum;
        while(start <= end){
            int mid = (start + end) / 2;
            int count = 0;
            int total = 0;
            for(int i=0; i<N; i++){
                total += arr[i];
                if(total > mid){
                    count++;
                    total = arr[i];
                }
            }
            if(total != 0) count++;
            if(count > M) start = mid + 1;
            else end = mid - 1;
        }

        System.out.print(start);
    }

}
