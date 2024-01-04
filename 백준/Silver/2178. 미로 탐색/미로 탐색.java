import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    static Queue<Point> queue;
    static class Point{
        int r;
        int c;

        Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];
        queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        bfs();

        System.out.print(maze[N-1][M-1]);
    }

    static void bfs(){
        queue.add(new Point(0, 0));
        visited[0][0] = true;

        while(!queue.isEmpty()){
            Point current = queue.poll();

            for(int d=0; d<dx.length; d++){
                int nr = current.r + dx[d];
                int nc = current.c + dy[d];
                if(isIn(nr, nc) && !visited[nr][nc] && maze[nr][nc] > 0){
                    queue.add(new Point(nr, nc));
                    visited[nr][nc] = true;
                    maze[nr][nc] = maze[current.r][current.c] + 1;
                }
            }
        }
    }

    static boolean isIn(int r, int c){
        return r >= 0 && c >= 0 && r < N && c < M;
    }
}
