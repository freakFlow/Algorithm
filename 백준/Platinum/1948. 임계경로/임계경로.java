import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static List<Node>[] graph, rGraph;
    static int[] inDegree;
    static int[] answer;
    static Queue<Integer> queue;
    static boolean[] visited;
    static int start, end;
    static int count;

    static class Node{
        int city;
        int weight;

        Node(int city, int weight){
            this.city = city;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new List[N + 1];
        rGraph = new List[N + 1];
        for(int n=1; n<=N; n++){
            graph[n] = new ArrayList<>();
            rGraph[n] = new ArrayList<>();
        }
        inDegree = new int[N + 1];
        answer = new int[N + 1];
        queue = new ArrayDeque<>();
        visited = new boolean[N + 1];

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[s].add(new Node(e, w));
            inDegree[e]++;
            rGraph[e].add(new Node(s, w));
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        queue.add(start);
        while(!queue.isEmpty()){
            int current = queue.poll();

            for(Node child : graph[current]){
                inDegree[child.city]--;
                answer[child.city] = Math.max(answer[child.city], answer[current] + child.weight);
                if(inDegree[child.city] == 0){
                    queue.add(child.city);
                }
            }
        }

        queue.add(end);
        visited[end] = true;
        while(!queue.isEmpty()){
            int current = queue.poll();

            for(Node child : rGraph[current]){
                if(answer[current] - child.weight == answer[child.city]){
                    count++;
                    if(!visited[child.city]){
                        visited[child.city] = true;
                        queue.add(child.city);
                    }
                }
            }
        }

        sb.append(answer[end]).append('\n').append(count);

        System.out.print(sb);
    }

}
