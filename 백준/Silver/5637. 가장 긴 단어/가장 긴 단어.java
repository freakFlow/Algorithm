import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String wooooord;
    static int length;

    public static void main(String[] args) throws IOException {
        while(true){
            StringBuilder str = new StringBuilder(br.readLine());
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == '-' || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) continue;
                str.replace(i, i + 1, " ");
            }

            st = new StringTokenizer(str.toString());
            boolean isEnd = false;

            while(st.hasMoreTokens()){
                String input = st.nextToken();

                if(input.equals("E-N-D")){
                    isEnd = true;
                    break;
                }

                if(input.length() > length){
                    length = input.length();
                    wooooord = input;
                }
            }

            if(isEnd) break;
        }

        sb.append(wooooord.toLowerCase());

        System.out.print(sb);
    }

}