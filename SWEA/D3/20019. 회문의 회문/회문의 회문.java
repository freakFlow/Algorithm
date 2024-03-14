import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T;
    static String S;
    static int len;
    static boolean isPofP;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=1; t<=T; t++){
            S = br.readLine();
            len = S.length();
            isPofP = true;

            if(len % 2 == 0) isPofP = false;
            else if(!isPalindrome(S)) isPofP = false;
            else isPofP = isPalindrome(S.substring(0, len / 2)) && isPalindrome(S.substring(len / 2 + 1, len));

            sb.append('#').append(t).append(' ').append(isPofP ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }

    static boolean isPalindrome(String str){
        int startIdx = 0;
        int endIdx = str.length() - 1;
        while(startIdx < endIdx){
            if(str.charAt(startIdx++) != str.charAt(endIdx--)) return false;
        }

        return true;
    }
}