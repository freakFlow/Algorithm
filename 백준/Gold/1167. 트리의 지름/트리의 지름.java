import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int V;
    static List<Edge>[] graph;
    static Queue<Integer> queue;
    static boolean[] visited;
    static int[] distance;
    static class Edge{
        int v;
        int weight;

        Edge(int v, int weight){
            this.v = v;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        V = Integer.parseInt(br.readLine());
        graph = new List[V];
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        queue = new LinkedList<>();
        visited = new boolean[V];
        distance = new int[V];

        for(int i=0; i<V; i++){
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken()) - 1;

            int v = Integer.parseInt(st.nextToken()) - 1;
            while(v >= 0){
                graph[idx].add(new Edge(v, Integer.parseInt(st.nextToken())));
                v = Integer.parseInt(st.nextToken()) - 1;
            }
        }

        dfs(0);

        int max = -1;
        int maxIdx = 0;
        for(int i=0; i<V; i++){
            if(max < distance[i]){
                max = distance[i];
                maxIdx = i;
            }
        }

        visited = new boolean[V];
        distance = new int[V];

        dfs(maxIdx);

        Arrays.sort(distance);

        System.out.print(distance[V-1]);
    }

    static void dfs(int v){
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();

            int size = graph[current].size();
            for(int i=0; i<size; i++){
                Edge child = graph[current].get(i);
                if(visited[child.v]) continue;

                queue.add(child.v);
                visited[child.v] = true;
                distance[child.v] = distance[current] + child.weight;
            }
        }
    }
}
