import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final long INF = Long.MAX_VALUE;
    static int N, M;
    static Edge[] edges;
    static long[] answer;
    static boolean hasCycle;

    static class Edge{
        int start;
        int end;
        int weight;

        Edge(int start, int end, int weight){
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        edges = new Edge[M];
        answer = new long[N + 1];
        for(int n=1; n<=N; n++){
            answer[n] = INF;
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edges[m] = new Edge(s, e, w);
        }

        answer[1] = 0;
        for(int n=0; n<N-1; n++){
            for(Edge edge : edges){
                if(answer[edge.start] == INF) continue;
                answer[edge.end] = Math.min(answer[edge.end], answer[edge.start] + edge.weight);
            }
        }

        for(Edge edge : edges){
            if(answer[edge.start] == INF) continue;
            if(answer[edge.start] + edge.weight < answer[edge.end]){
                hasCycle = true;
                break;
            }
        }

        if(hasCycle) sb.append(-1);
        else{
            for(int n=2; n<=N; n++){
                sb.append((answer[n] == INF) ? -1 : answer[n]).append('\n');
            }
        }

        System.out.print(sb);
    }

}
