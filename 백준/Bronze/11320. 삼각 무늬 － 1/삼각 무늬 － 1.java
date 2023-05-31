import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int T;
	static int A, B;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			int iter = A / B;
			int sum = 0;
			
			for(int i=0; i<iter; i++) {
				sum += i * 2 + 1;
			}
			
			sb.append(sum).append('\n');
		}
		
		System.out.println(sb);
	}
	
}