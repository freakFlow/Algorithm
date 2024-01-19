import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T, A, B;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if(B > A){
                int temp = A;
                A = B;
                B = temp;
            }

            sb.append(A * B / gcd(A, B)).append('\n');
        }

        System.out.print(sb);
    }

    static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }

}
