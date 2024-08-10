import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {-2, -2, 0, 0, 2, 2};
    static int[] dc = {-1, 1, -2, 2, -1, 1};

    static int N;
    static Info start, end;
    static int ans;

    static boolean[][] visited;
    static Queue<Info> q;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        start = new Info(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        end = new Info(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0);
        ans = -1;

        visited = new boolean[N][N];
        q = new ArrayDeque<>();

        visited[start.r][start.c] = true;
        q.add(start);

        bfs();

        sb.append(ans);

        System.out.print(sb);
    }

    static void bfs(){
        while(!q.isEmpty()){
            Info curr = q.poll();
            int r = curr.r;
            int c = curr.c;
            int w = curr.w;

            if(r == end.r && c == end.c){
                ans = w;
                break;
            }

            for(int d=0; d<dr.length; d++){
                int nr = r + dr[d];
                int nc = c + dc[d];

                if(isIn(nr, nc) && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new Info(nr, nc, w + 1));
                }
            }
        }
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<N && c>=0 && c<N;
    }

    static class Info{
        int r, c, w;

        Info(int r, int c, int w){
            this.r = r;
            this.c = c;
            this.w = w;
        }
    }
}