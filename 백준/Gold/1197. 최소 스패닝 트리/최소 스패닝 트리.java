import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int V, E;
    static List<Edge> graph;
    static int[] set;
    static int weight;

    static class Edge implements Comparable<Edge>{
        int v1;
        int v2;
        int w;

        Edge(int v1, int v2, int w){
            this.v1 = v1;
            this.v2 = v2;
            this.w = w;
        }

        public int compareTo(Edge e){
            return Integer.compare(this.w, e.w);
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        set = new int[V + 1];
        for(int v=1; v<=V; v++){
            set[v] = v;
        }

        for(int e=0; e<E; e++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.add(new Edge(a, b, c));
        }

        Collections.sort(graph);

        for(Edge edge : graph){
            if(find(edge.v1) == find(edge.v2)) continue;

            union(edge.v1, edge.v2);
            weight += edge.w;
        }

        System.out.print(weight);
    }

    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b) set[b] = a;
    }

    static int find(int a){
        if(set[a] == a) return a;

        return set[a] = find(set[a]);
    }
}
