import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    static int N, M;
    static int[][] arr;

    static PriorityQueue<Info> pq;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M][N];

        for(int m=0; m<M; m++){
            String input = br.readLine();
            for(int n=0; n<N; n++){
                arr[m][n] = input.charAt(n) - '0';
            }
        }

        pq = new PriorityQueue<>();
        visited = new boolean[M][N];

        visited[0][0] = true;
        pq.add(new Info(0, 0,0));

        bfs();

        System.out.print(sb);
    }

    static void bfs(){
        while(!pq.isEmpty()){
            Info curr = pq.poll();
            int r = curr.r;
            int c = curr.c;
            int wall = curr.wall;

            if(r == M-1 && c == N-1){
                sb.append(wall);
                break;
            }

            for(int d=0; d<dr.length; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(isIn(nr, nc) && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    pq.add(new Info(nr, nc, wall + arr[nr][nc]));
                }
            }
        }
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<M && c>=0 && c<N;
    }

    static class Info implements Comparable<Info>{
        int r, c;
        int wall;

        Info(int r, int c, int wall){
            this.r = r;
            this.c = c;
            this.wall = wall;
        }

        public int compareTo(Info i){
            return Integer.compare(this.wall, i.wall);
        }
    }
}