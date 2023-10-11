import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    static int n;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        
        sb.append(n).append(" is ").append((n % 2 == 0) ? "even" : "odd");
        
        System.out.print(sb);
    }
}