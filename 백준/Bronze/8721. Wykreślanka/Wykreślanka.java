import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int temp = 1;
        for(int n=0; n<N; n++){
            if(temp == Integer.parseInt(st.nextToken())) temp++;
            else answer++;
        }

        System.out.print(answer);
    }

}
