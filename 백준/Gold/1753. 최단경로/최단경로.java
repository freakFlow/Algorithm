import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int INF = Integer.MAX_VALUE;
    static int V, E;
    static int K;
    static List<Node>[] graph;
    static PriorityQueue<Node> pQueue;
    static boolean[] visited;
    static int[] answer;

    static class Node{
        int node;
        int weight;

        Node(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        graph = new List[V + 1];
        pQueue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.weight, o2.weight);
            }
        });
        visited = new boolean[V + 1];
        answer = new int[V + 1];
        for(int i=1; i<=V; i++){
            graph[i] = new ArrayList<>();
            answer[i] = INF;
        }

        int u, v, w;
        for(int e=0; e<E; e++){
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }

        pQueue.add(new Node(K, 0));
        answer[K] = 0;
        while(!pQueue.isEmpty()){
            Node current = pQueue.poll();
            if(visited[current.node]) continue;
            visited[current.node] = true;

            for(Node child : graph[current.node]){
                if(answer[current.node] + child.weight < answer[child.node]){
                    answer[child.node] = answer[current.node] + child.weight;
                    pQueue.add(new Node(child.node, answer[child.node]));
                }
            }
        }

        for(int i=1; i<=V; i++){
            sb.append((answer[i] == INF) ? "INF" : answer[i]).append('\n');
        }

        System.out.print(sb);
    }

}
