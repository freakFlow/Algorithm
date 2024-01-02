import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] arr;
    static int[] counts;
    static int[] temp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        counts = new int[10];
        temp = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        radixSort();

        for(int i=0; i<N; i++){
            sb.append(arr[i]).append('\n');
        }

        System.out.print(sb);
    }

    static void radixSort(){
        int radix = 1;
        while(radix <= 10000){
            countingSort(radix);
            radix *= 10;
        }
    }

    static void countingSort(int radix){
        counts = new int[10];

        for(int i=0; i<N; i++){
            counts[arr[i] / radix % 10]++;
        }

        for(int i=1; i<counts.length; i++){
            counts[i] += counts[i - 1];
        }

        for(int i=N-1; i>=0; i--){
            temp[--counts[arr[i] / radix % 10]] = arr[i];
        }

        for(int i=0; i<N; i++){
            arr[i] = temp[i];
        }
    }

}
