import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static List<Integer>[] graph;
    static int[] inDegree;
    static Queue<Integer> queue;
    static int[] answer;
    static int index;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new List[N + 1];
        for(int n=1; n<=N; n++){
            graph[n] = new ArrayList<>();
        }
        inDegree = new int[N + 1];
        queue = new ArrayDeque<>();
        answer = new int[N];

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A].add(B);
            inDegree[B]++;
        }

        for(int n=1; n<=N; n++){
            if(inDegree[n] == 0) queue.add(n);
        }

        while(!queue.isEmpty()){
            int current = queue.poll();
            answer[index++] = current;

            for(int child : graph[current]){
                inDegree[child]--;
                if(inDegree[child] == 0) queue.add(child);
            }
        }

        for(int n=0; n<N; n++){
            sb.append(answer[n]).append(' ');
        }

        System.out.print(sb);
    }

}
