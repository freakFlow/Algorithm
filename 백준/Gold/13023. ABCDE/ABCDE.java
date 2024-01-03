import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static boolean isFriend;
    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new List[N];
        for(int i=0; i<N; i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[N];

        int v1, v2;
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            v1 = Integer.parseInt(st.nextToken());
            v2 = Integer.parseInt(st.nextToken());
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        for(int i=0; i<N; i++){
            dfs(i, 1);
            if(isFriend) break;
        }

        System.out.print(isFriend ? 1 : 0);
    }

    static void dfs(int node, int depth){
        if(depth == 5 || isFriend){
            isFriend = true;
            return;
        }

        visited[node] = true;

        for(int i=0; i<graph[node].size(); i++){
            int child = graph[node].get(i);
            if(visited[child]) continue;
            dfs(child, depth + 1);
        }

        visited[node] = false;
    }
}
