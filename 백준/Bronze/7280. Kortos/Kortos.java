import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int S = 0, B = 1, V = 2, K = 3;
    static final char[] chars = {'S', 'B', 'V', 'K'};
    static final int TOTAL = 91;
    static final int SIZE = 51;
    static int[] count = new int[4];

    public static void main(String[] args) throws IOException {
        for(int i=0; i<SIZE; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            switch (str){
                case "S":
                    count[S] += num; break;
                case "B":
                    count[B] += num; break;
                case "V":
                    count[V] += num; break;
                case "K":
                    count[K] += num; break;
            }
        }

        for(int i=0; i<count.length; i++){
            if(count[i] != TOTAL){
                sb.append(chars[i]).append(' ').append(TOTAL - count[i]);
                break;
            }
        }

        System.out.print(sb);
    }

}
