import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int i=2; i<N; i++){
            if(N % i > 0){
                sb.append(i).append(' ');
                break;
            }
        }

        for(int i=N-1; i>1; i--){
            if(N % i > 0){
                sb.append(i);
                break;
            }
        }

        System.out.print(sb);
    }

}
