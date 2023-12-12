import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while(queue.size() > 1){
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.print(queue.poll());
    }

}
