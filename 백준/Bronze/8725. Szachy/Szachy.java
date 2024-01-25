import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int max;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            max = Integer.MIN_VALUE;
            for(int j=0; j<N; j++){
                max = Math.max(max, Integer.parseInt(st.nextToken()));
            }
            answer += Math.max(0, max);
        }

        System.out.print(answer);
    }

}
