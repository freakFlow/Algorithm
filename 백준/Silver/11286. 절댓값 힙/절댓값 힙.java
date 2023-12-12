import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int input;
    static PriorityQueue<Integer> priorityQueue;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);
                if(abs1 == abs2) return Integer.compare(o1, o2);

                return Integer.compare(abs1, abs2);
            }
        });

        for(int i=0; i<N; i++){
            input = Integer.parseInt(br.readLine());
            if(input == 0){
                sb.append(priorityQueue.isEmpty() ? 0 : priorityQueue.poll()).append('\n');
            }else{
                priorityQueue.add(input);
            }
        }

        System.out.print(sb );
    }

}
