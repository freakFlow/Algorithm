import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int K;
	static int C, B, n, r;
	static boolean[] index;
	static long ans;
	
	public static void main(String[] args) throws IOException {
		
		K = Integer.parseInt(br.readLine());
		for(int k=1; k<=K; k++) {
			st = new StringTokenizer(br.readLine());
			C = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			r = Integer.parseInt(st.nextToken());
			
			index = new boolean[C+1];
			st = new StringTokenizer(br.readLine());
			for(int b=0; b<B; b++) {
				index[Integer.parseInt(st.nextToken())] = true;
			}
			
			ans = 0;
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				if(index[Integer.parseInt(st.nextToken())]) {
					ans += (long)(Long.parseLong(st.nextToken()) * r / 100.0);
				}
			}
			
			sb.append(String.format("Data Set %d:\n%d\n\n", k, ans));
		}
		
		System.out.println(sb);
	}
}