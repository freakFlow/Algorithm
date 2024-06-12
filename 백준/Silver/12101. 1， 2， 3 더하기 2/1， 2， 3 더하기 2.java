import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int MAX = 11;

    static int N, K;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        init();

        findKth();

        System.out.print(sb);
    }

    static void findKth(){
        if(N == 0){
            sb.setLength(sb.length()-1);
            return;
        }

        int count = 0;
        int i = 1;
        for(; i<4; i++){
            count += arr[N][i];
            if(count >= K) break;
        }

        if(i == 4){
            sb.append(-1);
            return;
        }

        sb.append(i).append('+');
        K -= count - arr[N][i];
        N -= i;
        findKth();
    }

    static void init(){
        arr = new int[MAX][4];
        arr[1][1] = arr[2][1] = arr[2][2] = 1;
        arr[3][1] = 2;
        arr[3][2] = arr[3][3] = 1;

        for(int i=4; i<MAX; i++){
            for(int j=1; j<4; j++){
                arr[i][j] = arr[i-j][1] + arr[i-j][2] + arr[i-j][3];
            }
        }
    }
}