import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		
		for(int n=0; n<N; n++) {
			if(n % 2 == 1) {
				sb.append(' ');
			}
			
			for(int i=0; i<2*N-1; i++) {
				sb.append((i % 2 == 0) ? '*' : ' ');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}