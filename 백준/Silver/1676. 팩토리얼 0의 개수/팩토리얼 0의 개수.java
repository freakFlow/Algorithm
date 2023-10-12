import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static int count;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        count += N / 5;
        count += N / 25;
        count += N / 125;

        System.out.print(count);
    }
}