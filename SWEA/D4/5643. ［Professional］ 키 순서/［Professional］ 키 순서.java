import java.util.*;
import java.io.*;

public class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int N;
	static int M;
	static boolean[][] linked;
	static int cnt;

	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			N = Integer.parseInt(br.readLine());
			M = Integer.parseInt(br.readLine());
			
			linked = new boolean[N+1][N+1];
			for(int m=0; m<M; m++) {
				st = new StringTokenizer(br.readLine());
				int p = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				linked[p][c] = true;
			}
			
			int ans = 0;
			for(int i=1; i<=N; i++) {
				cnt = 0;
				findParents(i, new boolean[N+1]);
				findChildren(i, new boolean[N+1]);
				if(cnt + 1 == N) ans++;
			}
			
			sb.append(String.format("#%d %d\n", t, ans));
		}

		System.out.println(sb);
	}
	
	static void findParents(int i, boolean[] visited) {
		visited[i] = true;
		for(int c=1; c<N+1; c++) {
			if(linked[i][c] && !visited[c]) {
				cnt++;
				findParents(c, visited);
			}
		}
		
		return;
	}
	
	static void findChildren(int i, boolean[] visited) {
		visited[i] = true;
		for(int r=1; r<N+1; r++) {
			if(linked[r][i] && !visited[r]) {
				cnt++;
				findChildren(r, visited);
			}
		}
		
		return;
	}
	
}