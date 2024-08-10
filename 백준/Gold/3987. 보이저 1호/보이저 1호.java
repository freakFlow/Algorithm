import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    static int N, M;
    static char[][] arr;
    static int pr, pc, pd;
    static int ansDir, ansTime;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];

        for(int n=0; n<N; n++){
            arr[n] = br.readLine().toCharArray();
        }

        st = new StringTokenizer(br.readLine());
        pr = Integer.parseInt(st.nextToken()) - 1;
        pc = Integer.parseInt(st.nextToken()) - 1;

        for(pd=0; pd<dr.length; pd++){
            signal(pr, pc, pd, 1);
        }

        sb.append(toChar(ansDir)).append('\n').append(ansTime > N * M * 2 ? "Voyager" : ansTime);

        System.out.print(sb);
    }

    static void signal(int r, int c, int d, int time){
        int nr = r + dr[d];
        int nc = c + dc[d];

        if(!isIn(nr, nc) || arr[nr][nc] == 'C' || time > N * M * 2){
            if(time > ansTime){
                ansTime = time;
                ansDir = pd;
            }
            return;
        }

        if(arr[nr][nc] == '\\'){
            d = 3 - d;
        }else if(arr[nr][nc] == '/'){
            if(d < 2) d = 1 - d;
            else d = 5 - d;
        }

        signal(nr, nc, d, time + 1);
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<N && c>=0 && c<M;
    }

    static char toChar(int dir){
        switch(dir){
            case 0: return 'U';
            case 1: return 'R';
            case 2: return 'D';
            case 3: return 'L';
        }

        return 'U';
    }
}