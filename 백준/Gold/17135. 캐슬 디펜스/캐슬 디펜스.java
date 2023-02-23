import java.io.*;
import java.util.*;

/**
 * 
 * [핵심키워드]
 * 
 * [풀이방향]
 * 궁수 위치 조합 완전탐색
 * 
 * [입력 사항]
 * 3 ≤ N, M ≤ 15 N*M배열
 * 1 ≤ D ≤ 10 궁수의 사거리
 * 
 * [출력 사항]
 * 궁수의 공격으로 제거할 수 있는 적의 최대 수
 * deltas를 이용해 거리가 짧은 순서대로 왼쪽부터 적 탐색
 * 
 * @author quso12358
 * @since 2023. 2. 23.
 * @see https://www.acmicpc.net/problem/17135
 * @performance
 * @category
 */

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N, M, D;
	static int[][] map;
	static int[][] clone;
	static Shooter[] shooter;
	static int max = Integer.MIN_VALUE, sum;
	
	static int[][] deltas = {{-1, 1}, {1, 1}};
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		clone = new int[N][M];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		shooter = new Shooter[3];
		for(int i=0; i<shooter.length; i++) {
			shooter[i] = new Shooter(N-1);
		}
		
		makeCombination(0, 0);
		
		sb.append(max);
		
		System.out.println(sb);
	}
	
	// 궁수 위치 조합
	static void makeCombination(int nth, int start) {
		if(nth == shooter.length) {
			startRound();
			max = Math.max(max, sum);
			return;
		}
		
		for(int c=start; c<M; c++) {
			shooter[nth].c = c;
			makeCombination(nth+1, c+1);
		}
	}
	
	// 초기화
	static void init() {
		sum = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				clone[i][j] = map[i][j];
			}
		}
	}
	
	// 게임 시작
	static void startRound() {
		init();
		
		for(int r=0; r<N; r++) {
			for(int i=0; i<shooter.length; i++) {
				shooter[i].shoot();
			}

			deleteEnemy();
			
			nextRound();
		}
	}
	
	// 죽은 적 체크
	static void deleteEnemy() {
		int iter = Math.min(D, N);
		int r = clone.length-1;
		for(int i=0; i<iter; i++, r--) {
			for(int c=0; c<clone[r].length; c++) {
				if(clone[r][c] > 1) {
					sum ++;
					clone[r][c] = 0;
				}
			}
		}
	}
	
	// 배열 한행씩 내리기
	static void nextRound() {
		for(int i=clone.length-1; i>0; i--) {
			clone[i] = clone[i-1];
		}
		clone[0] = new int[M];
	}
	
	// 궁수 class
	static class Shooter{
		int r, c;
		
		Shooter(int r){
			this.r = r;
		}
		
		void shoot() {
			int sr = r;
			int sc = c;
			if(kill(sr, sc)) return;
			for(int i=1; i<D; i++) {
				sc = c - i;
				if(kill(sr, sc)) return;
				for(int j=0; j<i; j++) {
					sr += deltas[0][0];
					sc += deltas[0][1];
					if(kill(sr, sc)) return;
				}
				for(int j=0; j<i; j++) {
					sr += deltas[1][0];
					sc += deltas[1][1];
					if(kill(sr, sc)) return;
				}
			}
		}

		@Override
		public String toString() {
			return "Shooter [r=" + r + ", c=" + c + "]";
		}
		
		
	}
	
	static boolean kill(int r, int c) {
		if(isIn(r, c) && clone[r][c] >= 1) {
			clone[r][c]++;
			return true;
		}
		return false;
	}
	
	static boolean isIn(int r, int c) {
		return r>=0 && r<N && c>=0 && c<M;
	}
}