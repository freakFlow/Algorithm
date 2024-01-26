import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[] time;
    static List<Integer>[] graph;
    static int[] inDegree;
    static Queue<Integer> queue;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        time = new int[N + 1];
        graph = new List[N + 1];
        for(int n=1; n<=N; n++){
            graph[n] = new ArrayList<>();
        }
        inDegree = new int[N + 1];
        queue = new ArrayDeque<>();
        answer = new int[N + 1];

        for(int n=1; n<=N; n++){
            st = new StringTokenizer(br.readLine());
            time[n] = Integer.parseInt(st.nextToken());
            int building = Integer.parseInt(st.nextToken());
            while(building != -1){
                graph[building].add(n);
                inDegree[n]++;
                building = Integer.parseInt(st.nextToken());
            }
        }

        for(int n=1; n<=N; n++){
            if(inDegree[n] == 0){
                queue.add(n);
                answer[n] = time[n];
            }
        }

        while(!queue.isEmpty()){
            int current = queue.poll();

            for(int child : graph[current]){
                inDegree[child]--;
                answer[child] = Math.max(answer[child], answer[current] + time[child]);
                if(inDegree[child] == 0){
                    queue.add(child);
                }
            }
        }

        for(int n=1; n<=N; n++){
            sb.append(answer[n]).append('\n');
        }

        System.out.print(sb);
    }

}
