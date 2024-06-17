import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int iter;
    static int li, ci, lm, cm;
    static char[][] target;
    static char[][] arr;
    static int ans;

    public static void main(String[] args) throws IOException {
        iter = Integer.parseInt(br.readLine());

        for(int i=0; i<iter; i++){
            ans = 0;
            st = new StringTokenizer(br.readLine());
            li = Integer.parseInt(st.nextToken());
            ci = Integer.parseInt(st.nextToken());
            target = new char[li][ci];

            for(int r=0; r<li; r++){
                target[r] = br.readLine().toCharArray();
            }

            st = new StringTokenizer(br.readLine());
            lm = Integer.parseInt(st.nextToken());
            cm = Integer.parseInt(st.nextToken());
            arr = new char[lm][cm];

            for(int r=0; r<lm; r++){
                arr[r] = br.readLine().toCharArray();
            }

            for(int r=0; r<=lm-li; r++){
                for(int c=0; c<=cm-ci; c++){
                    check(r, c);
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }

    static void check(int R, int C){
        for(int r=0; r<li; r++){
            for(int c=0; c<ci; c++){
                if(target[r][c] != arr[r + R][c + C]) return;
            }
        }

        ans++;
    }
}