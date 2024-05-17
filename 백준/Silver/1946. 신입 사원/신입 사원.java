import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int T;
    static int N;
    static Info[] arr;
    static int ans;

    public static void main(String[] args) throws IOException{
        T = Integer.parseInt(br.readLine());
        for(int t=0; t<T; t++){
            N = Integer.parseInt(br.readLine());
            arr = new Info[N];
            ans = 0;
            
            for(int n=0; n<N; n++){
                st = new StringTokenizer(br.readLine());
                arr[n] = new Info(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            Arrays.sort(arr);

            int last = arr[0].n2;
            ans++;

            for(int n=1; n<N; n++){
                if(arr[n].n2 < last){
                    ans++;
                    last = Math.min(last, arr[n].n2);
                }
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }

    static class Info implements Comparable<Info>{
        int n1, n2;

        Info(int n1, int n2){
            this.n1 = n1;
            this.n2 = n2;
        }

        public int compareTo(Info i){
            return Integer.compare(n1, i.n1);
        }
    }
}