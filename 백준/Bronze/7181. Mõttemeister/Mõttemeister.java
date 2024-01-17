import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String answer;
    static int N;
    static int A, B;

    public static void main(String[] args) throws IOException {
        answer = br.readLine();
        N = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            String str = br.readLine();
            A = B = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(answer.contains(ch+"")) A++;
                if(answer.charAt(i) == ch) B++;
            }
            sb.append(A).append(' ').append(B).append('\n');
        }

        System.out.print(sb);
    }

}
