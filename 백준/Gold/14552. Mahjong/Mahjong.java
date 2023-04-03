import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int[] counts = new int[10];
	static List<Integer> triple = new ArrayList<>();
	static boolean ron;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			counts[Integer.parseInt(st.nextToken())]++;
		}
		
		for(int i=1; i<10; i++) {// 1삭 부터 9삭 까지 차례대로 대기패인지 체크
			if(counts[i] == 4) continue; // 패는 총 4개
			counts[i]++;
			if(isRon(Arrays.copyOf(counts, counts.length))) {
				sb.append(i).append(' ');
			}
			counts[i]--;
		}
		if(sb.length() == 0) sb.append(-1);
		
		System.out.println(sb);
	}
	
	static boolean isRon(int[] tiles) {
		// check 7heads
		if(is7heads(tiles)) {
			return true;
		}
		
		// check 1head and 4bodies
		ron = false;
		int[] temp = Arrays.copyOf(tiles, tiles.length);
		for(int i=1; i<10; i++) {// 1삭부터 9삭까지 head 먼저 찾기
			if(temp[i] < 2) continue;
			temp[i] -= 2; // head 빼기
			// 가능한 커쯔패 찾기
			findTriple(temp);
			// 커쯔패 부분집합 돌리기
			if(isSequence(temp)) { // 슌쯔로만 이루어진 경우
				return true;
			}
			for(int j=1; j<=triple.size(); j++) { // 커쯔가 하나 이상인 경우
				makeCombination(0, 0, new int[j], temp);
				if(ron) {
					return true;
				}
			}
			temp[i] += 2;
		}
		
		return false;
	}
	
	static void makeCombination(int nth, int start, int[] idx, int[] tiles) {
		if(nth == idx.length) {
			for(int i=0; i<idx.length; i++) { // 커쯔 패 빼기
				tiles[idx[i]] -= 3;
			}
			if(isSequence(tiles)) ron = true; // 나머지 몸이 슌쯔로 완성되면 역 완성!!
			for(int i=0; i<idx.length; i++) {// 원상 복귀
				tiles[idx[i]] += 3;
			}
			return;
		}
		
		for(int i=start; i<triple.size(); i++) {
			idx[nth] = triple.get(i);
			makeCombination(nth + 1, i + 1, idx, tiles);
		}
	}
	
	static boolean isSequence(int[] tiles) {
		int[] temp = Arrays.copyOf(tiles, tiles.length);
		for(int i=1; i<temp.length - 2; i++) {
			if(temp[i] == 0) continue;
			else if(temp[i] > 0) {
				temp[i+1] -= temp[i];
				temp[i+2] -= temp[i];
				temp[i] -= temp[i];
			}
		}
		
		for(int i=1; i<temp.length; i++) {
			if(temp[i] != 0) return false;
		}
		
		return true;
	}
	
	static void findTriple(int[] tiles) {
		triple.clear();
		for(int i=1; i<tiles.length; i++) {
			if(tiles[i] >= 3) triple.add(i);
		}
	}
	
	static boolean is7heads(int[] tiles) {
		int cnt = 0;
		for(int i=1; i<tiles.length; i++) {
			if(tiles[i] == 2) cnt++;
		}

		return cnt == 7 ? true : false;
	}
}