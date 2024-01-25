import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, M;
    static int answer;
    static int[] represent;
    static int[] parties;
    static int truth;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        represent = new int[N + 1];
        for(int n=0; n<=N; n++){
            represent[n] = n;
        }
        parties = new int[M];

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        if(T == 0){
            System.out.print(M);
            return;
        }

        truth = Integer.parseInt(st.nextToken());
        for(int t=1; t<T; t++){
            union(truth, Integer.parseInt(st.nextToken()));
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int party = Integer.parseInt(st.nextToken());
            for(int i=1; i<size; i++){
                union(party, Integer.parseInt(st.nextToken()));
            }
            parties[m] = party;
        }

        for(int m=0; m<M; m++){
            if(find(truth) != find(parties[m])) answer++;
        }

        System.out.print(answer);
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
