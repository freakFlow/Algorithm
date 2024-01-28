import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final long MIN = Long.MIN_VALUE;
    static final long MAX = Long.MAX_VALUE;
    static int N, S, E, M;
    static Edge[] edges;
    static int[] money;
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
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        edges = new Edge[M];
        money = new int[N];
        answer = new long[N];
        for(int n=0; n<N; n++){
            answer[n] = MIN;
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edges[m] = new Edge(s, e, -w);
        }

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<N; n++){
            money[n] = Integer.parseInt(st.nextToken());
        }

        for(int m=0; m<M; m++){
            edges[m].weight += money[edges[m].end];
        }

        answer[S] = money[S];
        for(int n=0; n<N-1; n++){
            for(Edge edge : edges){
                if(answer[edge.start] == MIN) continue;
                answer[edge.end] = Math.max(answer[edge.end], answer[edge.start] + edge.weight);
            }
        }

        for(int n=0; n<N; n++){
            for(Edge edge : edges){
                if(answer[edge.start] == MIN) continue;
                if(answer[edge.start] == MAX && edge.weight >= 0){
                    answer[edge.end] = MAX;
                }else if(answer[edge.end] < answer[edge.start] + edge.weight){
                    answer[edge.end] = MAX;
                }
            }
        }


        if(answer[E] == MIN) sb.append("gg");
        else if(answer[E] == MAX) sb.append("Gee");
        else sb.append(answer[E]);

        System.out.print(sb);
    }

}
