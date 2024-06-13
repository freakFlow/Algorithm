import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] antatica = {'a'-'a', 'n'-'a', 't'-'a', 'i'-'a', 'c'-'a'};

    static int N, K;
    static String[] words;
    static int ans;

    static boolean[] canRead;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        words = new String[N];

        for(int n=0; n<N; n++){
            words[n] = br.readLine();
        }

        if(K >= 5){
            canRead = new boolean[26];
            for (int i : antatica) {
                canRead[i] = true;
            }

            teach(0, 0);
        }

        sb.append(ans);

        System.out.print(sb);
    }

    static void teach(int idx, int start){
        if(idx == K-5){
            test();
            return;
        }

        for(int i=start; i<canRead.length; i++){
            if(canRead[i]) continue;
            canRead[i] = true;
            teach(idx + 1, i + 1);
            canRead[i] = false;
        }
    }

    static  void test(){
        int count = 0;
        boolean read;
        for(String str : words){
            read = true;
            for(int i=4; i<str.length()-4; i++){
                if(!canRead[str.charAt(i) - 'a']){
                    read = false;
                    break;
                }
            }
            if(read) count++;
        }

        ans = Math.max(ans, count);
    }
}
