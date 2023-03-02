import java.io.*;
import java.util.*;

public class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int N, W, H;
	static int[][] bricks;
	static int[][] clone;
	
	static int min;
	
	static int[][] deltas = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
	
	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			
			bricks = new int[H][W];
			clone = new int[H][W];
			for(int i=0; i<H; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0; j<W; j++) {
					bricks[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			min = Integer.MAX_VALUE;
			makePermutation(0, new int[N]);
			
			sb.append(String.format("#%d %d\n", t, min));
		}
		
		System.out.println(sb);
	}
	
	static void makePermutation(int nth, int[] drops) {
		if(nth == drops.length) {
			dropMarble(drops);
			return;
		}
		
		for(int i=0; i<W; i++) {
			drops[nth] = i;
			makePermutation(nth+1, drops);
		}
	}
	
	static void dropMarble(int[] drops) {
		makeClone();
		
		Outer:for(int d: drops) {
			for(int r=0; r<H; r++) {
				if(clone[r][d] != 0) {
					delete(r, d);
					down();
					continue Outer;
				}
			}
		}
		
		checkBricks();
	}
	
	static void makeClone() {
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				clone[i][j] = bricks[i][j];
			}
		}
	}
	
	static void delete(int row, int col) {
		int iter = clone[row][col];
		clone[row][col] = 0;
		for(int i=0; i<iter; i++) {
			for(int[] delta: deltas) {
				int nr = row + i * delta[0];
				int nc = col + i * delta[1];
				if(isIn(nr, nc)) {
					delete(nr, nc);
				}
			}
		}
	}
	
	static boolean isIn(int r, int c) {
		return r>=0 && r<H && c>=0 && c<W;
	}
	
	static void down() {
		for(int r=H-1; r>=0; r--) {
			for(int c=0; c<W; c++) {
				if(clone[r][c] == 0) {
					int firstRow = r - 1;
					while(isIn(firstRow, c) && clone[firstRow][c] == 0) firstRow--;
					
					if(isIn(firstRow, c)) {
						clone[r][c] = clone[firstRow][c];
						clone[firstRow][c] = 0;
					}
				}
			}
		}
	}
	
	static void checkBricks() {
		int sum = 0;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(clone[i][j] > 0) sum++;
			}
		}
		if(sum < min) {
			min = sum;
		}
	}
	
	static void print() {
		for(int[] r: clone) {
			System.out.println(Arrays.toString(r));
		}
		System.out.println();
	}
}