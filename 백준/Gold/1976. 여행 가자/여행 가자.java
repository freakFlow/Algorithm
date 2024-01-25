import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] represent;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        represent = new int[N + 1];
        for(int n=0; n<=N; n++){
            represent[n] = n;
        }

        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                if(st.nextToken().equals("1")) union(i, j);
            }
        }

        st = new StringTokenizer(br.readLine());
        int temp = find(Integer.parseInt(st.nextToken()));
        boolean isYes = true;
        for(int m=1; m<M; m++){
            if(find(Integer.parseInt(st.nextToken())) != temp){
                isYes = false;
                break;
            }
        }

        System.out.print(isYes ? "YES" : "NO");
    }

    static void union(int a, int b){
        int pa = find(a);
        int pb = find(b);
        if(pa != pb) represent[pb] = pa;
    }

    static int find(int num){
        if(represent[num] == num) return num;

        return represent[num] = find(represent[num]);
    }
}
