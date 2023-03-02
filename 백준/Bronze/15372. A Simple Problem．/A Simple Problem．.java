import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static long N;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			N = Long.parseLong(br.readLine());
			
			sb.append(N * N).append('\n');
		}
		
		System.out.println(sb);
	}
}