import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int Z;
    static int r, g, b;

    public static void main(String[] args) throws IOException {
        Z = Integer.parseInt(br.readLine());

        for(int z=0; z<Z; z++){
            r = g = b = 0;
            for(int i=0; i<10; i++){
                st = new StringTokenizer(br.readLine());
                r += Integer.parseInt(st.nextToken());
                g += Integer.parseInt(st.nextToken());
                b += Integer.parseInt(st.nextToken());
            }

            sb.append((int)Math.round(r / 10.0)).append(' ').append((int)Math.round(g / 10.0)).append(' ').append((int)Math.round(b / 10.0)).append('\n');
        }

        System.out.print(sb);
    }

}
