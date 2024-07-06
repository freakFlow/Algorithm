import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int N, K;
    static String S;
    static Info[] dots;
    static Info end;
    static boolean isYes;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        S = br.readLine();
        dots = new Info[N];

        int x = 0, y = 0;
        for(int i=0; i<N; i++){
            int d = getDir(S.charAt(i));
            x += dx[d];
            y += dy[d];
            dots[i] = new Info(x, y);
            if(x == 0 && y == 0) isYes = true;
        }
        end = dots[N - 1];

        if(!isYes){
            for(int i=0; i<N-1; i++){
                int kx = getK(dots[i].x, end.x);
                int ky = getK(dots[i].y, end.y);

                if(kx < 0 || ky < 0) continue;

                if(kx + ky == 0) isYes = true;
                else if(kx == 0 && ky < K) isYes = true;
                else if(ky == 0 && kx < K) isYes = true;
                else if(kx == ky && kx < K) isYes = true;
            }
        }

        sb.append(isYes ? "YES" : "NO");

        System.out.print(sb);
    }

    static int getK(int n, int en){
        if(n == 0 && en == 0) return 0;
        if(n * en >= 0 || n % en > 0) return -1;

        return -n / en;
    }

    static int getDir(char ch){
        switch(ch){
            case 'U':
                return 0;
            case 'R':
                return 1;
            case 'D':
                return 2;
            case 'L':
                return 3;
        }

        return -1;
    }

    static class Info{
        int x, y;

        Info(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}