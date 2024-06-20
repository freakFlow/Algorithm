import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String str;
    static int sum;

    static boolean isPrime;

    public static void main(String[] args) throws IOException {
        str = br.readLine();

        for(int i=0; i<str.length(); i++){
            sum += getNum(str.charAt(i));
        }

        isPrime = true;
        for(int i=2; i<sum; i++){
            if(sum % i == 0) {
                isPrime = false;
                break;
            }
        }

        sb.append(isPrime ? "It is a prime word." : "It is not a prime word.");

        System.out.print(sb);
    }

    static int getNum(char ch){
        if(ch >= 'a') return ch - 'a' + 1;
        return ch - 'A' + 27;
    }
}