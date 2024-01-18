import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static long n;
    static long answer;

    public static void main(String[] args) throws IOException {
        n = Long.parseLong(br.readLine());
        answer = n;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i != 0) continue;

            answer -= answer / i;

            while(n % i == 0){
                n /= i;
            }
        }

        if(n > 1) answer -= answer / n;

        System.out.print(answer);
    }

}
