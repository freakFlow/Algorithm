import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int[][] games = new int[15][2];
	static Result[] res = new Result[6];
	static int isPossible;

	public static void main(String[] args) throws IOException{
		
		int idx = 0;
		for(int i=0; i<res.length-1; i++) {// 대진표 완성
			for(int j=i+1; j<res.length; j++) {
				games[idx][0] = i;
				games[idx++][1] = j;
			}
		}
		
		for(int t=0; t<4; t++) {
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<res.length; i++) {// 게임결과 입력받기
				res[i] = new Result();
				res[i].win = Integer.parseInt(st.nextToken());
				res[i].draw = Integer.parseInt(st.nextToken());
				res[i].lose = Integer.parseInt(st.nextToken());
			}
			
			isPossible = 0;
			check(0);
			
			sb.append(isPossible).append(' ');
		}
		
		
		System.out.println(sb);
	}
	
	static boolean isClear() {
		for(Result r: res) {
			if(r.win + r.draw + r.lose != 0) return false;
		}
		return true;
	}
	
	static void check(int nth) {
		if(nth == games.length) {
			if(isClear()) isPossible = 1;
			return;
		}
		
		int team1 = games[nth][0];
		int team2 = games[nth][1];
		if(res[team1].win >= 1 && res[team2].lose >= 1) {// team1이 이기고 team2가 진 경우
			res[team1].win--;
			res[team2].lose--;
			check(nth+1);
			res[team1].win++;
			res[team2].lose++;
		}
		if(res[team1].draw >= 1 && res[team2].draw >= 1) {// 비긴 경우
			res[team1].draw--;
			res[team2].draw--;
			check(nth+1);
			res[team1].draw++;
			res[team2].draw++;
		}
		if(res[team1].lose >= 1 && res[team2].win >= 1) {// team1이 지고 team2가 이긴 경우
			res[team1].lose--;
			res[team2].win--;
			check(nth+1);
			res[team1].lose++;
			res[team2].win++;
		}
	}
}

class Result{
	int win;
	int draw;
	int lose;
}