import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] arr;
    static int[] count;
    static int max;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        count = new int[1000001];
        max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            count[arr[i]]++;
        }

        int sum = 0;
        for(int i=0; i<count.length; i++){
            sum += count[i];
            count[i] = sum;
        }

        for(int i=0; i<N; i++){
            max = Math.max(max, i - (count[arr[i]] - 1));
        }

        System.out.print(max + 1);
    }

}
