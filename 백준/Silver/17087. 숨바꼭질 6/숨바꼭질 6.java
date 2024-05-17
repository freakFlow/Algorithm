import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, S;
    static int ans;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ans = Math.abs(S - Integer.parseInt(st.nextToken()));
        for(int n=1; n<N; n++){
            int num = Math.abs(S - Integer.parseInt(st.nextToken()));
            ans = gcd(ans, num);
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }
}