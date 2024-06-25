import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int[] dr = {0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dc = {1, 0, -1, 0, 1, -1, 1, -1};

    static int N;
    static int[][] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int r=0; r<N; r++){
            String row = br.readLine();
            for(int c=0; c<N; c++){
                arr[r][c] = toNum(row.charAt(c));
            }
        }

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(arr[r][c] == 0){
                    for(int d=0; d<dr.length; d++){
                        int k = 1;
                        while(k < 5){
                            int nr = r + dr[d] * k;
                            int nc = c + dc[d] * k;
                            if(!isIn(nr, nc) || arr[nr][nc] != k) break;
                            k++;
                        }
                        if(k == 5) ans++;
                    }
                }
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static boolean isIn(int r, int c){
        return r>=0 && r<N && c>=0 && c<N;
    }

    static int toNum(char ch){
        switch(ch){
            case 'M':
                return 0;
            case 'O':
                return 1;
            case 'B':
                return 2;
            case 'I':
                return 3;
            case 'S':
                return 4;
            default:
                return -1;
        }
    }
}