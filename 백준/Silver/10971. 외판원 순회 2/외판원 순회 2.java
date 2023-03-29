import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int N;
	static int[][] costs;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		costs = new int[N][N];
		for(int i=0; i<costs.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<costs[i].length; j++) {
				costs[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<N; i++) {
			boolean[] visited = new boolean[N];
			visited[i] = true;
			int[] idx = new int[N];
			idx[0] = i;
			makePermutation(1, visited, idx);
		}
		
		sb.append(min);
			
		System.out.println(sb);
	}
	
	static void makePermutation(int nth, boolean[] visited, int[] idx) {
		if(nth == N) {
			min = Math.min(min, getCosts(idx));
			return;
		}
		
		for(int i=0; i<visited.length; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			idx[nth] = i;
			makePermutation(nth+1, visited, idx);
			visited[i] = false;
		}
	}
	
	static int getCosts(int[] idx) {
		int sum = 0;
		int cost;
		for(int i=0; i<idx.length-1; i++) {
			cost = costs[idx[i]][idx[i+1]];
			if(cost == 0) return Integer.MAX_VALUE;
			sum += cost;
		}
		cost = costs[idx[idx.length-1]][idx[0]];
		if(cost == 0) return Integer.MAX_VALUE;
		sum += cost;

		return sum;
	}
}