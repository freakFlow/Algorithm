import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int a, b, p, q;
    static List<Ratio>[] ratios;
    static long lcm, gcd;
    static boolean[] visited;
    static long[] answer;
    static class Ratio{
        int myRatio;
        int link;
        int linkRatio;

        Ratio(int myRatio, int link, int linkRatio){
            this.myRatio = myRatio;
            this.link = link;
            this.linkRatio = linkRatio;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        ratios = new List[N];
        for(int i=0; i<N; i++){
            ratios[i] = new ArrayList<>();
        }
        visited = new boolean[N];
        answer = new long[N];
        lcm = 1;

        for(int n=1; n<N; n++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            q = Integer.parseInt(st.nextToken());
            ratios[a].add(new Ratio(p, b, q));
            ratios[b].add(new Ratio(q, a, p));

            lcm *= p * q / gcd(p, q);
        }

        answer[0] = lcm;
        dfs(0);

        gcd = lcm;
        for(int i=0; i<N; i++){
            gcd = gcd(gcd, answer[i]);
        }
        for(int i=0; i<N; i++){
            sb.append(answer[i] / gcd).append(' ');
        }

        System.out.print(sb);
    }

    static long gcd(long a, long b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    static void dfs(int index){
        visited[index] = true;

        for(Ratio child : ratios[index]){
            if(!visited[child.link]){
                answer[child.link] = answer[index] * child.linkRatio / child.myRatio;
                dfs(child.link);
            }
        }
    }
}
