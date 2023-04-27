import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static final int MAX = 1000000;
	static String channel;
	static int N;
	static int M;
	static boolean[] buttons = new boolean[10];
	static int min;
	
	public static void main(String[] args) throws IOException {
		
		channel = br.readLine();
		N = Integer.parseInt(channel);
		M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = true;
		}
		
		if(M > 0) {
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<M; i++) {
				buttons[Integer.parseInt(st.nextToken())] = false;
			}
		}
		
		
		// '+' or '-' 버튼만 사용
		min = Math.abs(N - 100);
		
		// 채널버튼 사용
		for(int i=0; i<=MAX; i++) {
			if(check(i)) {
				min = Math.min(min, digit(i) + Math.abs(i - N));
			}
		}
		
		sb.append(min);
		
		System.out.println(sb);
	}
	
	static int digit(int n) {
		if(n == 0) return 1;
		
		int d = 0;
		while(n != 0) {
			d++;
			n /= 10;
		}
		
		return d;
	}
	
	static boolean check(int n) {
		if(n == 0) return buttons[n];
		
		while(n != 0) {
			if(!buttons[n % 10]) return false;
			n /= 10;
		}
		
		return true;
	}
}