import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static boolean[] arr;

    static final int SIZE = 10_000_000;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new boolean[SIZE];

        arr[0] = arr[1] = true;
        for(int i=0; i<SIZE; i++){
            if(arr[i]) continue;

            for(int j=i*2; j<SIZE; j+=i){
                arr[j] = true;
            }
        }

        for(int i=N; ; i++){
            if(!arr[i] && isPalindrome(i)){
                sb.append(i);
                break;
            }
        }

        System.out.print(sb);
    }

    static boolean isPalindrome(int num){
        char[] chars = Integer.valueOf(num).toString().toCharArray();
        int start = 0;
        int end = chars.length-1;

        while(start < end){
            if(chars[start++] != chars[end--]) return false;
        }

        return true;
    }
}
