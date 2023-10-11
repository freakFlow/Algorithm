import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    static String str1, str2;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        str1 = st.nextToken();
        str2 = st.nextToken();
        
        System.out.print(str1 + str2);
    }
}