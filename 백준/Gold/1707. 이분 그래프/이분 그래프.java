import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int K;
    static int V, E;
    static List<Integer>[] graph;

    static boolean[] set;
    static boolean[] visited;

    static boolean isYes;

    public static void main(String[] args) throws IOException {
        K = Integer.parseInt(br.readLine());

        for(int k=0; k<K; k++){
            st = new StringTokenizer(br.readLine());
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());
            graph = new List[V + 1];
            for(int v=1; v<=V; v++){
                graph[v] = new ArrayList<>();
            }

            for(int e=0; e<E; e++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a].add(b);
                graph[b].add(a);
            }

            set = new boolean[V + 1];
            visited = new boolean[V + 1];
            isYes = true;
            for(int v=1; v<=V; v++){

                dfs(v);

                if(!isYes) break;
            }

            sb.append(isYes ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }

    static void dfs(int start){
        visited[start] = true;

        for(int child : graph[start]){
            if(!visited[child]){
                set[child] = !set[start];
                dfs(child);
            }else if(set[child] == set[start]){
                isYes = false;
            }
        }
    }
}
