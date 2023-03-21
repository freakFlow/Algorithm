import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int a, b, c;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			for(int i=1; i<=a; i++) {
				for(int j=1; j<=b; j++) {
					for(int k=1; k<=c; k++) {
						if(i % j == j % k && i % j == k % i) cnt++;
					}
				}
			}
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
	}
	
}