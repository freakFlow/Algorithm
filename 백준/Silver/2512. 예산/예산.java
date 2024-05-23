import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] arr;
    static int sum, max;
    static int ans;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<N; n++){
            int num = Integer.parseInt(st.nextToken());
            arr[n] = num;
            sum += num;
            max = Math.max(max, num);
        }

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());

        if(sum <= M) ans = max;
        else{
            int idx = 0;
            int point = M / N;

            while(true){
                boolean keepGoing = false;
                while(arr[idx] <= point) {
                    keepGoing = true;
                    M -= arr[idx++];
                }

                if(!keepGoing || idx == N){
                    ans = point;
                    break;
                }

                point = M / (N - idx);
            }




        }

        sb.append(ans);

        System.out.print(sb);
    }
}