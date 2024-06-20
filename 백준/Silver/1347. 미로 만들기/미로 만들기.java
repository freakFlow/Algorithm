import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final char BLANK = '.', WALL = '#';

    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};

    static int length;
    static String str;
    static int r, c, d;
    static int min_r, min_c, max_r, max_c;
    static Queue<Info> q;
    static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        length = Integer.parseInt(br.readLine());
        str = br.readLine();
        r = c = 0;
        d = 1;
        q = new ArrayDeque<>();
        q.add(new Info(r, c));

        for(int i=0; i<length; i++){
            switch(str.charAt(i)){
                case 'F':
                    r += dr[d];
                    c += dc[d];
                    min_r = Math.min(min_r, r);
                    max_r = Math.max(max_r, r);
                    min_c = Math.min(min_c, c);
                    max_c = Math.max(max_c, c);
                    q.add(new Info(r, c));
                    break;
                case 'L':
                    d = (d - 1 + 4) % 4; break;
                case 'R':
                    d = (d + 1) % 4; break;
            }
        }

        arr = new boolean[max_r - min_r + 1][max_c - min_c + 1];
        for(Info i : q){
            arr[i.r - min_r][i.c - min_c] = true;
        }

        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                sb.append(arr[r][c] ? BLANK : WALL);
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }

    static class Info{
        int r, c;

        Info(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}
