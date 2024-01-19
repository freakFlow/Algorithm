import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static long A, B;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        if(B > A){
            long temp = A;
            A = B;
            B = temp;
        }

        System.out.print(gcd(A, B));
    }

    static String gcd(long a, long b){
        if(b == 0) {
            for(long i=0; i<a; i++){
                sb.append('1');
            }
            return sb.toString();
        }

        return gcd(b, a % b);
    }

}
