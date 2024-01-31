import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int[] dr = {0, 1, 0, -1};
    static final int[] dc = {1, 0, -1, 0};
    static final int SEA = -1;
    static final int LAND = 0;
    static int N, M;
    static int[][] map;
    static Queue<Point> queue;
    static boolean[][] visited;
    static int island;
    static List<Bridge> graph;
    static int[] parents;
    static int answer;

    static class Point{
        int r;
        int c;

        Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    static class Bridge implements Comparable<Bridge>{
        int i1;
        int i2;
        int len;

        Bridge(int i1, int i2, int len){
            this.i1 = i1;
            this.i2 = i2;
            this.len = len;
        }

        public int compareTo(Bridge bridge){
            return Integer.compare(this.len, bridge.len);
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        queue = new ArrayDeque<>();
        visited = new boolean[N][M];
        graph = new ArrayList<>();

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            for(int m=0; m<M; m++){
                map[n][m] = Integer.parseInt(st.nextToken()) - 1;
            }
        }

        for(int n=0; n<N; n++){
            for(int m=0; m<M; m++){
                if(map[n][m] == SEA || visited[n][m]) continue;
                bfs(n, m);
            }
        }

        parents = new int[island + 1];
        for(int i=0; i<parents.length; i++){
            parents[i] = i;
        }

        for(int n=0; n<N; n++){
            for(int m=0; m<M; m++){
                if(map[n][m] == SEA) continue;
                for(int i=0; i<4; i++){
                    int nr = n + dr[i];
                    int nc = m + dc[i];
                    int length = 0;
                    while(true){
                        if(!isIn(nr, nc) || map[nr][nc] == map[n][m]) break;

                        if(map[nr][nc] == SEA) length++;
                        else if(map[nr][nc] != map[n][m]){
                            if(length > 1){
                                graph.add(new Bridge(map[n][m], map[nr][nc], length));
                            }
                            break;
                        }
                        nr += dr[i];
                        nc += dc[i];
                    }
                }
            }
        }

        Collections.sort(graph);

        for(Bridge bridge : graph){
            if(find(bridge.i1) == find(bridge.i2)) continue;
            answer += bridge.len;
            union(bridge.i1, bridge.i2);
        }

        int parent = find(1);
        for(int i=2; i<=island; i++){
            if(find(i) != parent) answer = -1;
        }

        System.out.print(answer);
    }

    static void bfs(int r, int c){
        queue.add(new Point(r, c));
        map[r][c] = ++island;
        visited[r][c] = true;

        while(!queue.isEmpty()){
            Point point = queue.poll();

            for(int i=0; i<4; i++){
                int nr = point.r + dr[i];
                int nc = point.c + dc[i];
                if(!isIn(nr, nc) || visited[nr][nc] || map[nr][nc] == SEA) continue;
                queue.add(new Point(nr, nc));
                map[nr][nc] = island;
                visited[nr][nc] = true;
            }
        }
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<N && c>=0 && c<M;
    }

    static void union(int a, int b){
        a = find(a);
        b = find(b);
        if(a != b) parents[b] = a;
    }

    static int find(int a){
        if(parents[a] == a) return a;
        return parents[a] = find(parents[a]);
    }

}
