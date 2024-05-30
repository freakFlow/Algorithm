import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int T;
    static int K;
    static String[] words;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            K = Integer.parseInt(br.readLine());
            words = new String[K];

            for(int k=0; k<K; k++){
                words[k] = br.readLine();
            }

            boolean findIt = false;
            StringBuilder concat = new StringBuilder();

            for(int i=0; i<K; i++){
                for(int j=0; j<K; j++){
                    if(i == j) continue;

                    concat.append(words[i]).append(words[j]);

                    if(isPalindrome(concat.toString())){
                        findIt = true;
                        sb.append(concat.toString()).append('\n');
                        break;
                    }

                    concat.setLength(0);
                }

                if(findIt) break;
            }

            if(!findIt) sb.append("0\n");
        }

        System.out.print(sb);
    }

    static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }

        return true;
    }
}