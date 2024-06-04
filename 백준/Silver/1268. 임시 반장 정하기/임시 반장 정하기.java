import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int[][] arr;
    static int ans, cnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N][5];
        ans = 1;

        for(int r=0; r<N; r++){
            st = new StringTokenizer(br.readLine());
            for(int c=0; c<5; c++){
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int r=0; r<N; r++){
            Set<Integer> friend = new HashSet<>();
            for(int t=0; t<N; t++){
                if(r == t) continue;

                for(int c=0; c<5; c++){
                    if(arr[r][c] == arr[t][c]){
                        friend.add(t);
                    }
                }

                if(friend.size() > cnt){
                    cnt = friend.size();
                    ans = r + 1;
                }
            }
        }

        sb.append(ans);

        System.out.print(sb);
    }


}