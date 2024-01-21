import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, K, X, Y;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            if(getDistance(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())) > K) answer++;
        }

        System.out.print(answer);
    }

    static double getDistance(int x, int y){
        return Math.sqrt(Math.pow(X - x, 2) + Math.pow(Y - y, 2));
    }

}
