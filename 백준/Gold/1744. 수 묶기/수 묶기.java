import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int zero;
    static int one;
    static PriorityQueue<Integer> pqPlus, pqMinus;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        pqPlus = new PriorityQueue<>(Comparator.reverseOrder());
        pqMinus = new PriorityQueue<>();

        for(int n=0; n<N; n++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) zero++;
            else if(num == 1) one++;
            else if(num > 1) pqPlus.add(num);
            else pqMinus.add(num);
        }

        while(pqPlus.size() > 1){
            answer += pqPlus.poll() * pqPlus.poll();
        }

        if(!pqPlus.isEmpty()) answer += pqPlus.poll();

        while(pqMinus.size() > 1){
            answer += pqMinus.poll() * pqMinus.poll();
        }

        if(!pqMinus.isEmpty() && zero == 0) answer += pqMinus.poll();

        answer += one;

        System.out.print(answer);
    }

}
