import java.io.*;
import java.util.*;

public class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static int N;
	static boolean[] checked;
	static int count;
	
	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			N = Integer.parseInt(br.readLine());
			checked = new boolean[10];
			count = 0;
			
			int ans = N;
			int temp = ans;
			int idx = -1;
			while(true) {
				while(temp != 0) {
					idx = temp % 10;
					temp /= 10;
					if(!checked[idx]) {
						checked[idx] = true;
						count++;
					}
				}
				if(count == 10) break;
				
				ans += N;
				temp = ans;
			}
			
			sb.append(String.format("#%d %d\n", t, ans));
		}
		
		System.out.println(sb);
	}
	
	
}


