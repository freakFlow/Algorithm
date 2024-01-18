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

        int lastTime = 0;
        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            int connected = Integer.parseInt(st.nextToken());
            if(connected == 0) continue;

            answer = Math.max(answer, time - lastTime);
            lastTime = time;
        }

        System.out.print(answer);
    }

}
