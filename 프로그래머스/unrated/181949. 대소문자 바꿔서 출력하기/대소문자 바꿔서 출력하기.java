import java.util.*;
import java.io.*;

public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String str;
    static int diff = 'a' - 'A';

    public static void main(String[] args) throws IOException {
        str = br.readLine();

        for(int i=0; i<str.length(); i++){
            sb.append(str.charAt(i) <= 'Z' ? (char) (str.charAt(i) + diff) : (char) (str.charAt(i) - diff));
        }

        System.out.print(sb);
    }
}