import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int K;
    static List<Edge>[] graph;
    static PriorityQueue<Node> pQueue;
    static PriorityQueue<Integer>[] answer;

    static class Edge{
        int node;
        int weight;

        Edge(int node, int weight){
            this.node = node;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int node;
        int value;

        Node(int node, int value){
            this.node = node;
            this.value = value;
        }

        public int compareTo(Node node){
            return Integer.compare(this.value, node.value);
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new List[N + 1];
        pQueue = new PriorityQueue<Node>();
        answer = new PriorityQueue[N + 1];
        for(int n=1; n<=N; n++){
            graph[n] = new ArrayList<>();
            answer[n] = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return Integer.compare(o2, o1);
                }
            });
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[a].add(new Edge(b, c));
        }

        pQueue.add(new Node(1, 0));
        answer[1].add(0);
        while(!pQueue.isEmpty()){
            Node current = pQueue.poll();

            for(Edge edge : graph[current.node]){
                int sum = current.value + edge.weight;
                if(answer[edge.node].size() < K){
                    answer[edge.node].add(sum);
                    pQueue.add(new Node(edge.node, sum));
                }else if(sum < answer[edge.node].peek()){
                    answer[edge.node].poll();
                    answer[edge.node].add(sum);
                    pQueue.add(new Node(edge.node, sum));
                }
            }
        }

        for(int n=1; n<=N; n++){
            if(answer[n].size() < K) sb.append(-1);
            else sb.append(answer[n].peek());
            sb.append('\n');
        }

        System.out.print(sb);
    }

}
