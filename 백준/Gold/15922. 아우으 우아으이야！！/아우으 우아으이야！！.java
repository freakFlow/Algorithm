import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int x, y;
    static int start, end;
    static int ans;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        start = x;
        end = y;

        for(int n=1; n<N; n++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if(x > end){
                ans += end - start;
                start = x;
                end = y;
            }else if(y > end){
                end = y;
            }
        }

        ans += end - start;

        sb.append(ans);

        System.out.print(sb);
    }
}