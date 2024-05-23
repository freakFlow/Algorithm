import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T, N;
    static int[][] arr = new int[10001][4];

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        arr[1][1] = 1;
        arr[2][1] = arr[2][2] = 1;
        arr[3][1] = arr[3][2] = arr[3][3] = 1;

        for(int i=4; i<arr.length; i++){
            arr[i][1] = 1;

            arr[i][2] = arr[i-2][2] + arr[i-2][1];

            arr[i][3] = arr[i-3][3] + arr[i-3][2] + arr[i-3][1];
        }

        for(int t=0; t<T; t++){
            N = Integer.parseInt(br.readLine());

            sb.append(arr[N][1] + arr[N][2] + arr[N][3]).append('\n');
        }

        System.out.print(sb);
    }
}