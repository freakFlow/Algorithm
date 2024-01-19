import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int l, w, h, v;

    public static void main(String[] args) throws IOException {
        while(true){
            st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if(l + w + h + v == 0) break;

            if(v == 0){
                v = l * w * h;
            }else if(l == 0){
                l = v / (w * h);
            }else if(w == 0){
                w = v / (l * h);
            }else{
                h = v / (l * w);
            }

            sb.append(l).append(' ').append(w).append(' ').append(h).append(' ').append(v).append('\n');
        }

        System.out.print(sb);
    }

}
