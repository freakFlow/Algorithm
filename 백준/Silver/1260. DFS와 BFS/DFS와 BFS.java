import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M, V;
    static List<Integer>[] graph;
    static boolean[] visited;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken()) - 1;

        graph = new List[N];
        for(int i=0; i<N; i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N];
        queue = new LinkedList<>();

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken()) - 1;
            int v2 = Integer.parseInt(st.nextToken()) - 1;
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        for(int i=0; i<N; i++){
            Collections.sort(graph[i]);
        }

        dfs(V);
        visited = new boolean[N];
        sb.append('\n');
        bfs();

        System.out.print(sb);
    }

    static void dfs(int node){
        visited[node] = true;
        sb.append(node + 1).append(' ');

        int size = graph[node].size();
        for(int i=0; i<size; i++){
            int child = graph[node].get(i);
            if(visited[child]) continue;
            dfs(child);
        }
    }

    static void bfs(){
        queue.add(V);

        while(!queue.isEmpty()){
            int current = queue.poll();
            if(visited[current]) continue;

            visited[current] = true;
            sb.append(current + 1).append(' ');

            int size = graph[current].size();
            for(int i=0; i<size; i++){
                int child = graph[current].get(i);
                if(visited[child]) continue;
                queue.add(child);
            }
        }
    }
}
