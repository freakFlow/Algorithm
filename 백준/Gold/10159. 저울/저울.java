import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static List<Integer>[] low, high;
    static int know;

    static boolean[] visited;
    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        low = new List[N + 1];
        high = new List[N + 1];

        for(int n=1; n<=N; n++){
            low[n] = new ArrayList<>();
            high[n] = new ArrayList<>();
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            low[a].add(b);
            high[b].add(a);
        }

        q = new ArrayDeque<>();
        for(int n=1; n<=N; n++){
            know = 0;
            visited = new boolean[N + 1];

            visited[n] = true;
            know++;
            q.add(n);

            bfs(low);

            q.add(n);
            bfs(high);

            sb.append(N - know).append('\n');
        }

        System.out.print(sb);
    }

    static void bfs(List<Integer>[] graph){
        while(!q.isEmpty()){
            int curr = q.poll();

            for(int child : graph[curr]){
                if(!visited[child]){
                    visited[child] = true;
                    know++;
                    q.add(child);
                }
            }
        }
    }
}