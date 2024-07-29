import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N, K;
    static int[] belt;
    static boolean[] robot;
    static int broken, ans;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        belt = new int[2 * N];
        robot = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int n=0; n<2*N; n++){
            belt[n] = Integer.parseInt(st.nextToken());
        }

        while(true){
            ans++;
            // 1. 로봇, 벨트 한 칸씩 회전
            for(int n=N-2; n>=0; n--){
                if(robot[n]){
                    robot[n+1] = true;
                    robot[n] = false;
                }
            }
            robot[N-1] = false;

            int temp = belt[2*N-1];
            for(int n=2*N-2; n>=0; n--){
                belt[n+1] = belt[n];
            }
            belt[0] = temp;

            // 2. 로봇 이동
            for(int n=N-2; n>=0; n--){
                if(robot[n] && !robot[n+1] && belt[n+1] > 0){
                    robot[n+1] = true;
                    robot[n] = false;
                    belt[n+1]--;
                    if(belt[n+1] == 0) broken++;
                }
            }
            robot[N-1] = false;

            // 3. 로봇 올리기
            if(belt[0] > 0){
                robot[0] = true;
                belt[0]--;
                if(belt[0] == 0) broken++;
            }

            // 3. 종료조건 확인
            if(broken >= K) break;
        }

        sb.append(ans);

        System.out.print(sb);
    }
}