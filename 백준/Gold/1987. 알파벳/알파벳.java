import java.io.*;
import java.util.*;

/**
 * 
 * [핵심키워드]
 * 한 칸씩 움직이며 중복된 문자없이 지날 수 있는 최대 칸 수(dfs or bfs)
 * 
 * [풀이방향]
 * 사방으로 움직이며 각자의 root배열을 가지고 중복된 문자 검사
 * root를 boolean배열로 구현하자 메모리 초과 -> 비트 마스킹 이용 
 * 비트 마스킹해도 메모리 초과
 * 
 * [입력 사항]
 * 1 ≤ R,C ≤ 20 인 R*C개의 대문자 배열
 * 
 * [출력 사항]
 * 한 칸씩 움직이며 중복된 문자없이 지날 수 있는 최대 칸 수
 * 
 * @author quso12358
 * @since 2023. 2. 23.
 * @see https://www.acmicpc.net/problem/1987
 * @performance
 * @category
 */

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int R, C;
	static char[][] board;
	static ArrayDeque<Pawn> stack = new ArrayDeque<>();
	static int[][] counts;
	static int max = 0;
	
	static int[][] deltas = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		board = new char[R][C];
		counts = new int[R][C];
		for(int i=0; i<R; i++) {
			String input = br.readLine();
			for(int j=0; j<C; j++) {
				board[i][j] = input.charAt(j);
			}
		}
		
		stack.push(new Pawn(0, 0, 0));
		
		while(!stack.isEmpty()) {
			Pawn p = stack.pop();
			
			if(p.getDepth() > max) {
				max = p.getDepth();
			}
			
			counts[p.r][p.c]= p.getDepth(); 
			
			for(int d=0; d<deltas.length; d++) {
				int nr = p.r + deltas[d][0];
				int nc = p.c + deltas[d][1];
				if(isIn(nr, nc) && !p.check(board[nr][nc]-'A')) {
					stack.push(new Pawn(nr, nc, p.root));
				}
			}
		}
		
		sb.append(max);
		
		System.out.println(sb);
	}
	
	static class Pawn{
		int r, c;
		int root;
		
		Pawn(int r, int c, int root){
			this.r = r;
			this.c = c;
			this.root = root;
			this.root |= 1 << (board[r][c] - 'A');
		}
		
		int getDepth() {
			int cnt = 0;
			for(int i=0; i<26; i++) {
				if((root & (1<<i)) > 0) cnt++;
			}
			return cnt;
		}
		
		boolean check(int n) {
			if((root & (1<<n)) > 0) return true;
			return false;
		}
	}
	
	static boolean isIn(int r, int c) {
		return r>=0 && r<R && c>=0 && c<C;
	}
}