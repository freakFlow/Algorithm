import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dc = {1, 0, -1, 0, 1, -1, -1, 1};

    static Info king, stone;
    static int N;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        king = new Info(8 - (input.charAt(1) - '0'), input.charAt(0) - 'A');
        input = st.nextToken();
        stone = new Info(8 - (input.charAt(1) - '0'), input.charAt(0) - 'A');
        N = Integer.parseInt(st.nextToken());

        for(int n=0; n<N; n++){
            int d = toDir(br.readLine());
            int nr = king.r + dr[d];
            int nc = king.c + dc[d];

            if(!isIn(nr, nc)) continue;

            if(stone.r == nr && stone.c == nc){
                int sr = stone.r + dr[d];
                int sc = stone.c + dc[d];

                if(!isIn(sr, sc)) continue;

                stone.r = sr;
                stone.c = sc;
            }

            king.r = nr;
            king.c = nc;
        }

        sb.append((char)(king.c + 'A')).append(8 - king.r).append('\n').append((char)(stone.c + 'A')).append(8 - stone.r);

        System.out.print(sb);
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<8 && c>=0 && c<8;
    }

    static int toDir(String str){
        switch(str){
            case "R": return 0;
            case "B": return 1;
            case "L": return 2;
            case "T": return 3;
            case "RB": return 4;
            case "LB": return 5;
            case "LT": return 6;
            case "RT": return 7;
        }

        return 0;
    }

    static class Info{
        int r, c;

        Info(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}