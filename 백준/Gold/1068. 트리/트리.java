import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static List<Integer>[] graph;
    static int rootNode;
    static int deleteNode;
    static int leafNode;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new List[N];
        visited = new boolean[N];
        for(int n=0; n<N; n++){
            graph[n] = new ArrayList<>();
        }

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<N; n++){
            int parent = Integer.parseInt(st.nextToken());
            if(parent == -1){
                rootNode = n;
                continue;
            }
            graph[parent].add(n);
        }

        deleteNode = Integer.parseInt(br.readLine());

        visited[deleteNode] = true;
        if(rootNode == deleteNode) leafNode = 0;
        else dfs(rootNode);

        sb.append(leafNode);

        System.out.print(sb);
    }

    static void dfs(int num){
        visited[num] = true;

        int childNode = 0;
        for(int child : graph[num]){
            if(visited[child]) continue;

            childNode++;
            dfs(child);
        }

        if(childNode == 0) leafNode++;
    }
}
