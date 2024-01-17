import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static long A, B;
    static boolean[] arr;
    static int answer;

    static final int SIZE = 10_000_000;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        arr = new boolean[SIZE + 1];

        arr[0] = arr[1] = true;

        for(int i=2; i<= Math.sqrt(SIZE); i++){
            if(arr[i]) continue;

            for(int j=2; j * i <= SIZE; j++){
                arr[j * i] = true;
            }
        }

        for(int i=2; i<=SIZE; i++){
            if(arr[i]) continue;

            long pow = i;
            while(i <= (double)B / pow){
                if(i >= (double)A / pow){
                    answer++;
                }
                pow *= i;
            }
        }

        System.out.print(answer);
    }

}
