import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] A;
    static int[] nge;
    static Deque<Integer> stack;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        nge = new int[N];
        stack = new ArrayDeque<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            while(!stack.isEmpty() && A[stack.peek()] < A[i]){
                nge[stack.pop()] = A[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            nge[stack.pop()] = -1;
        }

        for(int i=0; i<N; i++){
            sb.append(nge[i]).append(' ');
        }

        System.out.print(sb);
    }

}
