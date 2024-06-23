import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static String input;
    static int robot, box, goal;
    static int ans;

    public static void main(String[] args) throws IOException {
        input = br.readLine();
        ans = -1;

        for(int i=0; i<input.length(); i++){
            switch(input.charAt(i)){
                case '@' : robot = i; break;
                case '#' : box = i; break;
                case '!' : goal = i; break;
            }
        }

        if((robot<=box && box<=goal) || (goal<=box && box<=robot)){
            ans = Math.abs(goal - robot) - 1;
        }

        sb.append(ans);

        System.out.print(sb);
    }
}