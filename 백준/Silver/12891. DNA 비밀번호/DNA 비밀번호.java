import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int S;
    static int P;
    static char[] dna;
    static int[] count;
    static final int A = 0, C = 1, G = 2, T = 3;
    static int answer;

    public static void main(String[] args) throws IOException{
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        dna = br.readLine().toCharArray();

        count = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<count.length; i++){
            count[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<P; i++){
            switch(dna[i]){
                case 'A':
                    count[A]--;
                    break;
                case 'C':
                    count[C]--;
                    break;
                case 'G':
                    count[G]--;
                    break;
                case 'T':
                    count[T]--;
                    break;
            }
        }
        checkCount();

        for(int i=P; i<S; i++){
            switch(dna[i-P]){
                case 'A':
                    count[A]++;
                    break;
                case 'C':
                    count[C]++;
                    break;
                case 'G':
                    count[G]++;
                    break;
                case 'T':
                    count[T]++;
                    break;
            }
            switch (dna[i]){
                case 'A':
                    count[A]--;
                    break;
                case 'C':
                    count[C]--;
                    break;
                case 'G':
                    count[G]--;
                    break;
                case 'T':
                    count[T]--;
                    break;
            }
            checkCount();
        }

        System.out.print(answer);
    }

    static void checkCount(){
        for(int i=0; i<count.length; i++){
            if(count[i] > 0) return;
        }

        answer++;
    }
}
