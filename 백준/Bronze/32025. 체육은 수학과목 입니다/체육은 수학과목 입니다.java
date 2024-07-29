import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int H, W;

    public static void main(String[] args) throws IOException {
        H = Integer.parseInt(br.readLine());
        W = Integer.parseInt(br.readLine());

        sb.append((int)Math.min(H, W) * 50);

        System.out.print(sb);
    }
}