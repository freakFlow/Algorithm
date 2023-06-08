import java.io.*;
import java.util.*;

public class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int N, M;
	
	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			boolean flag = (M & ((1 << N)- 1)) == ((1 << N) - 1);
			
			sb.append('#').append(t).append(' ').append(flag ? "ON" : "OFF").append('\n');
		}
		
		System.out.println(sb);
	}
	
	
}


