import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int M, N;
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new boolean[N + 1];
        arr[0] = arr[1] = true;

        for(int i=2; i<=N; i++){
            if(arr[i]) continue;

            for(int j=2; j * i <= N; j++){
                arr[j * i] = true;
            }
        }

        for(int i=M; i<=N; i++){
            if(arr[i]) continue;

            sb.append(i).append('\n');
        }

        System.out.print(sb);
    }

}
