import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static boolean baseman;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int n=0; n<N; n++){
            String name = br.readLine();
            if(name.equals("anj")){
                baseman = true;
                break;
            }
        }

        sb.append(baseman ? "뭐야;" : "뭐야?");

        System.out.print(sb);
    }
}