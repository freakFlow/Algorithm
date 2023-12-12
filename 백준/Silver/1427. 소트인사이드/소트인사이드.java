import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String N;
    static int[] num;

    public static void main(String[] args) throws IOException{
        N = br.readLine();
        num = new int[N.length()];

        for(int i=0; i<N.length(); i++){
            num[i] = Integer.parseInt(N.substring(i, i+1));
        }

        for(int i=0; i<num.length-1; i++){
            int max = -1;
            int index = -1;
            for(int j=i; j<num.length; j++){
                if(num[j] > max){
                    max = num[j];
                    index = j;
                }
            }
            int temp = num[i];
            num[i] = num[index];
            num[index] = temp;
        }

        for(int i=0; i<num.length; i++){
            sb.append(num[i]);
        }

        System.out.print(sb);
    }

}
