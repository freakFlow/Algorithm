import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int sum;
    static int startIdx, endIdx;
    static int answer;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        sum = 1;
        startIdx = endIdx = 1;
        answer = 1;

        while(endIdx < N){
            if(sum == N){
                answer++;
                sum += ++endIdx;
            }else if(sum < N){
                sum += ++endIdx;
            }else{
                sum -= startIdx++;
            }
        }

        System.out.print(answer);
    }
}
