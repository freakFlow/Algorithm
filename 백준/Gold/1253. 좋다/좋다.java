import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] num;
    static int startIdx, endIdx;
    static long sum;
    static int answer;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        num = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        for(int i=0; i<N; i++){
            sum = 0;
            startIdx = 0;
            endIdx = N - 1;

            while(startIdx < endIdx){
                sum = num[startIdx] + num[endIdx];
                if(sum == num[i]){
                    if(i == startIdx){
                        startIdx++;
                        continue;
                    }
                    if(i == endIdx){
                        endIdx--;
                        continue;
                    }
                    answer++;
                    break;
                }else if(sum < num[i]){
                    startIdx++;
                }else{
                    endIdx--;
                }
            }
        }

        System.out.print(answer);
    }
}
