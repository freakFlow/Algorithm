import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static List<Integer>[] graph;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new List[N];
        for(int i=0; i<N; i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N];

        int v1 = 0, v2 = 0;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            v1 = Integer.parseInt(st.nextToken()) - 1;
            v2 = Integer.parseInt(st.nextToken()) - 1;
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }

        System.out.print(answer);
    }

    static void dfs(int node){
        visited[node] = true;

        int size = graph[node].size();
        for(int i=0; i<size; i++){
            int child = graph[node].get(i);
            if(visited[child]) continue;
            dfs(child);
        }
    }
}
