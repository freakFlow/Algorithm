import java.io.*;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N, r, c;
	static int cnt = -1;
	static boolean isAns;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		searchZ(N, 0, 0);
		
		sb.append(cnt);
		
		System.out.println(sb);
	}
	
	static void searchZ(int N, int row, int col) {
		if(isAns) {
			return;
		}
		if(N == 0) {
			cnt++;
			if(row == r && col == c) {
				isAns = true;
			}
			return;
		}
		
		int d = (int)Math.pow(2, N-1);
		if(r<row+d && c<col+d) {
			searchZ(N-1, row, col);
		}else if(r<row+d && c<col+2*d) {
			cnt += d * d;
			searchZ(N-1, row, col + d);
		}else if(r<row+2*d && c<col+d) {
			cnt += 2 * d * d;
			searchZ(N-1, row + d, col);
		}else {
			cnt += 3 * d * d;
			searchZ(N-1, row+d, col+d);
		}
		
	}
}