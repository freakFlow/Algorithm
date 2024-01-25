import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int[] represent;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        represent = new int[N + 1];
        for(int n=0; n<=N; n++){
            represent[n] = n;
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            if(st.nextToken().equals("0")){
                union(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }else if(find(Integer.parseInt(st.nextToken())) == find(Integer.parseInt(st.nextToken()))){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
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
