import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N;
	static int[][] image;
	
	public static void main(String[] args) throws IOException{
		
		N = Integer.parseInt(br.readLine());
		image = new int[N][N];
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			for(int j=0; j<N; j++) {
				image[i][j] = input.charAt(j) - '0';
			}
		}
		
		makeQuadTree(N, 0, 0);
		
		System.out.println(sb);
	}
	
	static void makeQuadTree(int N, int r, int c) {
		if(canZip(N, r, c)) {
			sb.append(image[r][c]);
			return;
		}
		
		int d = N / 2;
		 
		sb.append('(');
		makeQuadTree(d, r, c);
		makeQuadTree(d, r, c+d);
		makeQuadTree(d, r+d, c);
		makeQuadTree(d, r+d, c+d);
		sb.append(')');
		
		
	}
	
	static boolean canZip(int N, int r, int c) {
		int sum = 0;
		for(int i=r; i<r+N; i++) {
			for(int j=c; j<c+N; j++) {
				sum += image[i][j];
			}
		}
		return (sum == 0 || sum == N * N) ? true : false;
	}
}