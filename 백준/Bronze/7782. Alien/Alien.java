import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int b1, b2;
    static int lx, ly, hx, hy;
    static boolean isYes;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        b1 = Integer.parseInt(st.nextToken());
        b2 = Integer.parseInt(st.nextToken());

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            lx = Integer.parseInt(st.nextToken());
            ly = Integer.parseInt(st.nextToken());
            hx = Integer.parseInt(st.nextToken());
            hy = Integer.parseInt(st.nextToken());
            if(lx <= b1 && b1 <= hx && ly <= b2 && b2 <= hy){
                isYes = true;
                break;
            }
        }

        System.out.print(isYes ? "Yes" : "No");
    }

}
