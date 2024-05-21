import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int H, W, X, Y;
    static int row, col;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        row = H + X;
        col = W + Y;
        arr = new int[row][col];

        for(int r=0; r<row; r++){
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<col; c++){
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int r=0; r<H; r++){
            for(int c=0; c<W; c++){
                arr[r+X][c+Y] -= arr[r][c];
            }
        }

        for(int r=0; r<H; r++){
            for(int c=0; c<W; c++){
                sb.append(arr[r][c]).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}