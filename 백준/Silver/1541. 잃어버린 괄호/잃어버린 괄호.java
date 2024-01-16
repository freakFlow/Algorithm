import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static StringTokenizer input;
    static int answer;

    public static void main(String[] args) throws IOException {
        input = new StringTokenizer(br.readLine(), "-");

        answer += sum(input.nextToken());

        while(input.hasMoreTokens()){
            answer -= sum(input.nextToken());
        }

        System.out.print(answer);
    }

    static int sum(String str){
        st = new StringTokenizer(str, "+");
        int sum = 0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }

        return sum;
    }

}
