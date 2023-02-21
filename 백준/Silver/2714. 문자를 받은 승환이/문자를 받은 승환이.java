import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int R, C;
	static String msg;
	static char[][] arr;
	static boolean[][] isVisited;
	static int[][] deltas = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			msg = st.nextToken();
			arr = new char[R][C];
			int idx = 0;
			for(int i=0; i<R; i++) {
				for(int j=0; j<C; j++) {
					arr[i][j] = msg.charAt(idx++);
				}
			}
			isVisited = new boolean[R][C];
			
			read();
		}
		
		System.out.println(sb);
	}
	
	static char toChar(StringBuilder binary) {
		int decimal = 0;
		for(int i=0; i<binary.length(); i++) {
			decimal += (binary.charAt(binary.length()-i-1)-'0') * Math.pow(2, i);
		}
		
		return (decimal == 0) ? ' ' : (char)('A' + decimal - 1);
	}
	
	static void read() {
		int d = 0, cnt = 0;
		int r = 0, c = 0;
		StringBuilder binary = new StringBuilder();
		StringBuilder decoded = new StringBuilder();
		
		while(cnt < R * C) {
			binary.append(arr[r][c]);
			isVisited[r][c] = true;
			cnt++;
			if(binary.length() == 5) {
				decoded.append(toChar(binary));
				binary.delete(0, 5);
			}
			
			int nr = r + deltas[d][0];
			int nc = c + deltas[d][1];
			if(!isIn(nr, nc) || isVisited[nr][nc]) {
				d = ++d % 4;
			}
			r += deltas[d][0];
			c += deltas[d][1];
		}
		
		rtrim(decoded);
		sb.append(decoded).append('\n');
	}
	
	static boolean isIn(int x, int y) {
		return 0<=x && x<R && 0<=y && y<C;
	}
	
	static void rtrim(StringBuilder s) {
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == ' ') {
				s.deleteCharAt(i);
			}else {
				break;
			}
		}
	}
	
}