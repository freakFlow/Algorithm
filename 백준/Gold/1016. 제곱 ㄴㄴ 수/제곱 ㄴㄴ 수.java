import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static long min, max;
    static int size;
    static boolean[] arr;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());
        size = (int) (max - min + 1);
        arr = new boolean[size];

        for(long num=2; num*num <= max ;num++){
            long pow = num * num;
            long start = min / pow;
            if(min % pow > 0) start++;

            for(long i=start; i * pow <= max; i++){
                arr[(int)(i * pow - min)] = true;
            }
        }

        for(int i=0; i<size; i++){
            if(!arr[i]) answer++;
        }

        System.out.print(answer);
    }

}
