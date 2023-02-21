import java.io.*;
import java.util.*;

import javax.swing.event.ListDataListener;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int stdNum;
	static int[] candy;
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		while((stdNum = Integer.parseInt(br.readLine())) != 0) {
			candy = new int[stdNum];
			for(int i=0; i<stdNum; i++) {
				candy[i] = Integer.parseInt(br.readLine());
			}
			
			cnt = 0;
			while(!isOver()) {
				whistle();
			}
			
			sb.append(cnt).append(' ').append(candy[0]).append('\n');
		}
		
		System.out.println(sb);
	}
	
	static void whistle() {
		cnt++;
		int temp = candy[candy.length-1] / 2;
		candy[candy.length-1] /= 2;
		for(int i=candy.length-2; i>=0; i--) {
			candy[i+1] += candy[i]/2;
			candy[i] /= 2;
		}
		candy[0] += temp;
		
		for(int i=0; i<candy.length; i++) {
			if(candy[i] % 2 == 1) {
				candy[i]++;
			}
		}
	}
	
	static boolean isOver() {
		int temp = candy[0];
		for(int c: candy) {
			if(temp != c) {
				return false;
			}
		}
		return true;
	}
}