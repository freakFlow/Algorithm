import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String word = br.readLine();
        int index = Integer.parseInt(br.readLine());
        System.out.print(word.charAt(index - 1));
    }
}