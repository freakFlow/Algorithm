import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int joker;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        joker = 1;

        for(int n=0; n<N; n++){
            boolean isJokerRight = joker > 13;
            boolean isRightTurn = true;
            int card = 0;
            if(isJokerRight) joker -= 13;

            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                if(isRightTurn != isJokerRight) {
                    card += num;
                    isRightTurn = !isRightTurn;
                    continue;
                }

                if(joker > num){
                    joker -= num;
                    card += num;
                    isRightTurn = !isRightTurn;
                    continue;
                }

                joker += card;
                break;
            }
        }

        sb.append(joker);

        System.out.print(sb);
    }
}