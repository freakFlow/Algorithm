import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int M;
    static int[] num;
    static int startIdx, endIdx;
    static int sum;
    static int answer;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        num = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        startIdx = 0;
        endIdx = N - 1;
        sum = 0;

        while(startIdx < endIdx){
            sum = num[startIdx] + num[endIdx];

            if(sum == M){
                answer++;
                endIdx--;
            }else if(sum < M){
                startIdx++;
            }else{
                endIdx--;
            }
        }

        System.out.print(answer);
    }
}
