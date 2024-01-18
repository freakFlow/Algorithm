import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, K;
    static int people;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            people += Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
            if(people > K){
                answer = Math.max(answer, people - K);
            }
        }

        System.out.print(answer);
    }

}
