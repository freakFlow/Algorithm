import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static String original, input;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        original = br.readLine();
        input = br.readLine();

        for(int i=0; i<N; i++){
            if(original.charAt(i) == input.charAt(i)) answer++;
        }

        System.out.print(answer);
    }

}
