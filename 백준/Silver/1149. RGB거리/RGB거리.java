import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int N;
	static int[][] costs;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		costs = new int[N][3];
		
		for(int i=0; i<costs.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<costs[i].length; j++) {
				costs[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<costs.length; i++) {
			for(int j=0; j<costs[i].length; j++) {
				int links = Integer.MAX_VALUE;
				for(int k=0; k<costs[i].length; k++) {
					if(j == k) continue;
					links = Math.min(links, costs[i-1][k]);
				}
				costs[i][j] += links;
			}
		}
		
		sb.append(Math.min(costs[N-1][0], Math.min(costs[N-1][1], costs[N-1][2])));
			
		System.out.println(sb);
	}
	
}