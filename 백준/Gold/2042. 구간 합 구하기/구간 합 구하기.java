import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N, M, K;
	static int a, b;
	static long c;
	static long[] fwt;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		fwt = new long[N + 1];
		for(int i=1; i<fwt.length; i++) {
			update(i, Long.parseLong(br.readLine()));
		}
		
		for(int i=0; i<M+K; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Long.parseLong(st.nextToken());
			
			if(a == 1) {
				update(b, c - (sum(b) - sum(b-1)));
			}else {
				sb.append(sum((int)c) - sum(b-1)).append('\n');
			}
		}
		
		System.out.println(sb);
	}
	
	static long sum(int idx) {
		long sum = 0;
		while(idx > 0) {
			sum += fwt[idx];
			idx &= idx-1;
		}
		
		return sum;
	}
	
	static void update(int idx, long val) {
		while(idx<fwt.length) {
			fwt[idx] += val;
			idx += idx & -idx;
		}
	}
}