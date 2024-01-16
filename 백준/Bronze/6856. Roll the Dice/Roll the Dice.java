import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int M, N;
    static int answer;

    public static void main(String[] args) throws IOException {
        M = Math.min(9, Integer.parseInt(br.readLine()));
        N = Math.min(9, Integer.parseInt(br.readLine()));

        for(int m=1; m<=M; m++){
            if(10 - m <= N && 10 - m > 0) answer++;
        }

        if(answer == 1){
            sb.append("There is 1 way to get the sum 10.");
        }else{
            sb.append("There are ").append(answer).append(" ways to get the sum 10.");
        }

        System.out.print(sb);
    }

}
