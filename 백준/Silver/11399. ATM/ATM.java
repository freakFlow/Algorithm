import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] time;
    static int total;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        time = new int[N];
        total = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            time[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++){
            int index = i;
            int temp = time[i];
            for(int j=index-1; j>=0; j--){
                if(time[j] > time[i]){
                    index = j;
                    continue;
                }
                break;
            }

            for(int j=i; j>index; j--){
                time[j] = time[j-1];
            }
            time[index] = temp;
        }

        for(int i=1; i<N; i++){
            time[i] += time[i - 1];
        }

        for(int i=0; i<N; i++){
            total += time[i];
        }

        System.out.print(total);
    }

}
