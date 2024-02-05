import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int sum;
    static int edge;
    static PriorityQueue<Edge> graph;
    static int[] parent;

    static class Edge implements Comparable<Edge>{
        int com1;
        int com2;
        int len;

        Edge(int com1, int com2, int len){
            this.com1 = com1;
            this.com2 = com2;
            this.len = len;
        }

        public int compareTo(Edge e){
            return Integer.compare(this.len, e.len);
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new PriorityQueue<>();
        parent = new int[N];
        for(int n=0; n<N; n++){
            parent[n] = n;
        }

        for(int n=0; n<N; n++){
            String str = br.readLine();
            for(int i=0; i<N; i++){
                char ch = str.charAt(i);
                if(ch == '0') continue;
                int len = 0;
                if(ch < 'a') len = ch - 'A' + 27;
                else len = ch - 'a' + 1;
                graph.add(new Edge(n, i, len));
                sum += len;
            }
        }

        while(!graph.isEmpty()){
            Edge current = graph.poll();
            if(find(current.com1) == find(current.com2)) continue;

            union(current.com1, current.com2);
            sum -= current.len;
            edge++;
        }

        if(edge == N-1) sb.append(sum);
        else sb.append(-1);

        System.out.print(sb);
    }

    static int find(int num){
        if(parent[num] == num) return num;

        return parent[num] = find(parent[num]);
    }

    static void union(int n1, int n2){
        n1 = find(n1);
        n2 = find(n2);

        if(n1 != n2) parent[n2] = n1;
    }
}
