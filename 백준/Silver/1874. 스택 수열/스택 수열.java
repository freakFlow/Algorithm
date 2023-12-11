import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] arr;
    static Deque<Integer> stack;
    static int current;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        stack = new ArrayDeque<>();
        current = 1;

        for(int i=0; i<N; i++){
            if(arr[i] >= current){
                while(arr[i] >= current){
                    stack.push(current++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                if(stack.isEmpty() || stack.pop() != arr[i]){
                    System.out.print("NO");
                    return;
                }

                sb.append("-\n");
            }
        }

        System.out.print(sb);
    }

    static class Card{
        int index;
        int value;

        Card(int index, int value){
            this.index = index;
            this.value = value;
        }
    }
}
