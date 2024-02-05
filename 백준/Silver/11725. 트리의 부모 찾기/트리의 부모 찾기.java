import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static List<Integer>[] graph;
    static int[] parents;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new List[N + 1];
        parents = new int[N + 1];
        visited = new boolean[N + 1];
        for(int n=1; n<=N; n++){
            graph[n] = new ArrayList<>();
        }

        for(int n=0; n<N-1; n++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        bfs(1);

        for(int n=2; n<=N; n++){
            sb.append(parents[n]).append('\n');
        }

        System.out.print(sb);
    }

    static void bfs(int num){
        visited[num] = true;

        for(int child : graph[num]){
            if(visited[child]) continue;
            parents[child] = num;
            bfs(child);
        }
    }

}
