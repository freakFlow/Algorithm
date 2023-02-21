import java.io.*;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int R, C;
	static boolean[][] map;
	static int[][] deltas = {{-1, 1}, {0, 1}, {1, 1}};
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new boolean[R][C];
		for(int i=0; i<R; i++) {
			String input = br.readLine();
			for(int j=0; j<C; j++) {
				if(input.charAt(j) == 'x') {
					map[i][j] = true;
				}
			}
		}
		
		for(int i=0; i<R; i++) {
			if(makeLine(i, 0)) {
				cnt++;
			}
		}
		
		sb.append(cnt);
		
		
		System.out.println(sb);
	}
	
	static boolean makeLine(int row, int col) {
		if(!isOk(row, col)) return false;
		
		if(col == C-1) {
			map[row][col] = true;
			return true;
		}
		
		map[row][col] = true;
		boolean isLinked = false;
		for(int d=0; d<deltas.length; d++) {
			int nr = row + deltas[d][0];
			int nc = col + deltas[d][1];
			
			if(makeLine(nr, nc)) {
				isLinked = true;
				break;
			}
		}
		//map[row][col] = isLinked;
		
		return isLinked;
	}
	
	static boolean isOk(int r, int c) {
		return r>=0 && r<R && c>=0 && c<C && !map[r][c];
	}
}