import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T;
    static List<String> words;
    static HashSet<String> hs;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            words = new ArrayList<>();
            hs = new HashSet<>();

            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                words.add(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            while(true){
                if(st.nextToken().equals("what")) break;

                st.nextToken();
                hs.add(st.nextToken());

                st = new StringTokenizer(br.readLine());
            }

            for(String fox : words){
                if(hs.contains(fox)) continue;
                sb.append(fox).append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}