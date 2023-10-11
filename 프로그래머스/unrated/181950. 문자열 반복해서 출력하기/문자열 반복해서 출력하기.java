import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String str;
    static int n;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        str = st.nextToken();
        n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            sb.append(str);
        }

        System.out.print(sb);
    }
}