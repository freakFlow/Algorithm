import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int left, right;
    static int ans;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        left = Integer.parseInt(st.nextToken());
        for(int n=1; n<N; n++){
            right = Integer.parseInt(st.nextToken());
            if(left > right){
                int k = (int)Math.ceil(Math.log(left) / Math.log(2) - Math.log(right) / Math.log(2));
                ans += k;
                right *= (int)Math.pow(2, k);
            }
            left = right;
        }

        sb.append(ans);

        System.out.print(sb);
    }
}