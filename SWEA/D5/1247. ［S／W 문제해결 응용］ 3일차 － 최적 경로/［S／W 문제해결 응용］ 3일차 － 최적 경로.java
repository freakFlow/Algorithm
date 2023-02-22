import java.io.*;
import java.util.*;

public class Solution {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int N;
	static int[][] client;
	static int[] com;
	static int[] home;
	static int min;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			N = Integer.parseInt(br.readLine());
			com = new int[2];
			home = new int[2];
			client = new int[N][2];
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<com.length; i++) {
				com[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0; i<home.length; i++) {
				home[i] = Integer.parseInt(st.nextToken());
			}
			for(int i=0; i<client.length; i++) {
				for(int j=0; j<client[i].length; j++) {
					client[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			min = Integer.MAX_VALUE;
			makePermutation(0, new boolean[N], 0);
			
			sb.append(String.format("#%d %d\n", t, min));
		}
		
		
		System.out.println(sb);
	}
	
	static void makePermutation(int nth, boolean[] isSelected, int path) {
		if(nth == N) {
			path += getDistance(home);
			min = Math.min(min , path);
			return;
		}
		
		for(int i=0; i<isSelected.length; i++) {
			if(isSelected[i]) continue;
			isSelected[i] = true;
			int[] before = Arrays.copyOf(com, com.length);
			int newPath = path + getDistance(client[i]);
			if(newPath < min) {
				com = Arrays.copyOf(client[i], client[i].length);
				makePermutation(nth+1, isSelected, newPath);
			}
			com = Arrays.copyOf(before, before.length);
			isSelected[i] = false;
		}
	}
	
	static int getDistance(int[] to) {
		return Math.abs(com[0]-to[0]) + Math.abs(com[1]-to[1]);
	}
}