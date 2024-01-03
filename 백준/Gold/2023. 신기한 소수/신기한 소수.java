import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);

        System.out.print(sb);
    }

    static void dfs(int num, int cnt){
        if(cnt == N){
            sb.append(num).append('\n');
            return;
        }

        for(int i=1; i<10; i+=2){
            if(isPrime(num * 10 + i)){
                dfs(num * 10 + i, cnt + 1);
            }
        }
    }

    static boolean isPrime(int num){
        for(int i=2; i<num; i++){
            if(num % i == 0) return false;
        }

        return true;
    }

}
