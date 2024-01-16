import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            StringBuilder temp = new StringBuilder(br.readLine());
            sb.append(temp.reverse()).append('\n');
        }

        System.out.print(sb);
    }

}
