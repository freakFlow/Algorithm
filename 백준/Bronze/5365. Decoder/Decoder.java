import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int length = 1;
        for(int n=0; n<N; n++){
            String word = st.nextToken();
            if(length > word.length()){
                sb.append(' ');
            }else{
                sb.append(word.charAt(length - 1));
            }
            length = word.length();
        }

        System.out.print(sb);
    }

}
