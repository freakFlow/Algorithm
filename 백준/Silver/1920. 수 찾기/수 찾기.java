import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            sb.append(binarySearch(0, N-1, Integer.parseInt(st.nextToken())) ? 1 : 0).append('\n');
        }

        System.out.print(sb);
    }

    static boolean binarySearch(int start, int end, int target){
        if(start > end) return false;

        int mid = (start + end) / 2;

        if(arr[mid] == target) return true;
        else if(arr[mid] > target) return binarySearch(start, mid - 1, target);
        else return binarySearch(mid + 1, end, target);
    }
}
