import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static char[] input;
    static int length;
    static Deque<Block> deque;
    static int ans;

    public static void main(String[] args) throws IOException {
        input = br.readLine().toCharArray();
        length = input.length;
        ans = Integer.MAX_VALUE;

        for(int i=0; i<length; i++){
            char temp = input[length - 1];
            for(int j=length - 1; j>0; j--){
                input[j] = input[j-1];
            }
            input[0] = temp;

            if(input[length - 1] == 'a') continue;

            deque = new ArrayDeque<>();

            for(int j=0; j<length;) {
                int countOfA = 0;
                while (j < length && input[j] == 'a') {
                    countOfA++;
                    j++;
                }
                int countOfB = 0;
                while (j < length && input[j] == 'b') {
                    countOfB++;
                    j++;
                }

                deque.add(new Block(countOfA, countOfB));
            }

            int count = 0;

            while(deque.size() > 1){
                Block head = deque.peekFirst();
                Block tail = deque.peekLast();

                if(head.b > tail.a){
                    head.b -= tail.a;
                    count += tail.a;
                    deque.pollLast();
                }else{
                    tail.a -= head.b;
                    count += head.b;
                    deque.pollFirst();
                }
            }

            ans = Math.min(ans, count);
        }

        sb.append(ans == Integer.MAX_VALUE ? 0 : ans);

        System.out.print(sb);
    }

    static class Block{
        int a, b;

        Block(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
}