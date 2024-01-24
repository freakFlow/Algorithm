import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int[] SEND = {0, 0, 1, 1, 2, 2};
    static final int[] RECEIVE = {1, 2, 0, 2, 0, 1};
    static final int A = 0, B = 1, C = 2;

    static int[] max;
    static boolean[] answer;

    static boolean[][] visited;
    static Queue<int[]> queue;

    public static void main(String[] args) throws IOException {
        max = new int[3];
        answer = new boolean[201];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++){
            max[i] = Integer.parseInt(st.nextToken());
        }


        visited = new boolean[201][201];
        queue = new ArrayDeque<>();

        bfs();

        for(int i=0; i<answer.length; i++){
            if(answer[i]) sb.append(i).append(' ');
        }

        System.out.print(sb);
    }

    static void bfs(){
        visited[0][0] = true;
        answer[max[C]] = true;
        queue.add(new int[]{0, 0});

        int[] temp = new int[3];
        while(!queue.isEmpty()){
            int[] current = queue.poll();

            for(int i=0; i<6; i++){
                temp[A] = current[A];
                temp[B] = current[B];
                temp[C] = max[C] - (current[A] + current[B]);

                temp[RECEIVE[i]] += temp[SEND[i]];
                temp[SEND[i]] = 0;
                if(temp[RECEIVE[i]] > max[RECEIVE[i]]){
                    temp[SEND[i]] = temp[RECEIVE[i]] - max[RECEIVE[i]];
                    temp[RECEIVE[i]] = max[RECEIVE[i]];
                }
                if(visited[temp[A]][temp[B]]) continue;

                if(temp[A] == 0) answer[temp[C]] = true;
                visited[temp[A]][temp[B]] = true;
                queue.add(new int[]{temp[A], temp[B]});
            }
        }
    }

}
