import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M, K, X;
    static List<Integer>[] graph;
    static int[] distance;

    static Queue<Integer> queue;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        graph = new List[N + 1];
        for(int i=0; i<=N; i++){
            graph[i] = new ArrayList<>();
        }
        distance = new int[N + 1];
        queue = new LinkedList<>();
        visited = new boolean[N + 1];

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            graph[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }

        bfs();

        boolean check = false;
        for(int i=1; i<=N; i++){
            if(distance[i] == K){
                sb.append(i).append('\n');
                check = true;
            }
        }
        if(!check) sb.append(-1);

        System.out.print(sb);
    }

    static void bfs(){
        visited[X] = true;
        queue.add(X);

        while(!queue.isEmpty()){
            int parent = queue.poll();
            for(Integer child : graph[parent]){
                if(visited[child]) continue;

                distance[child] = distance[parent] + 1;
                visited[child] = true;
                queue.add(child);
            }
        }
    }

}
