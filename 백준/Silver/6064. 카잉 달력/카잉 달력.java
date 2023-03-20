import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int T;
	static int M, N;
	static long x, y;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		Outer:for(int t=0; t<T; t++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			x = Long.parseLong(st.nextToken());
			y = Long.parseLong(st.nextToken());
			
			if(x == y) {
				sb.append(x).append('\n');
			}else {
				long lcm = lcm(M, N);
				while(x<=lcm && y<=lcm) {
					if(x + M < y + N) {
						x += M;
					}else {
						y += N;
					}
					
					if(x == y) {
						sb.append(x).append('\n');
						continue Outer;
					}
				}
				sb.append(-1).append('\n');
			}
			
			
		}
		
		System.out.println(sb);
	}
	
	static int gcd(int a, int b) {
		if(a % b == 0) return b;
		
		return gcd(b, a % b);
	}
	
	static long lcm(int a, int b) {
		return a / gcd(Math.max(a, b), Math.min(a, b)) * b;
	}
}