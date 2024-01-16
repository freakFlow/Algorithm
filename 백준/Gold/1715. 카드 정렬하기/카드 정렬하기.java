import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static PriorityQueue<Integer> pq;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        pq = new PriorityQueue<>();

        for(int n=0; n<N; n++){
            pq.add(Integer.parseInt(br.readLine()));
        }

        while(pq.size() > 1){
            int temp = pq.poll() + pq.poll();
            answer += temp;
            pq.add(temp);
        }

        System.out.print(answer);
    }

}
