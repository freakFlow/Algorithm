import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String str;
    static int num;

    public static void main(String[] args) throws IOException {
        for(int i=0; i<3; i++){
            str = br.readLine();
            if(str.charAt(0) == 'F' || str.charAt(0) == 'B') continue;

            num = Integer.parseInt(str) + 3 - i;
        }

        if(num % 3 != 0 && num % 5 != 0) sb.append(num);

        if(num % 3 == 0) sb.append("Fizz");
        if(num % 5 == 0) sb.append("Buzz");

        System.out.print(sb);
    }
}