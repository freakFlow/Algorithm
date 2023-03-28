import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		
		sb.append(recursive(N, 0));
		
		System.out.println(sb);
	}
	
	static int recursive(int n, int cnt) {
		if(n == 1 || n == 0) return cnt;
		
		return Math.min(recursive(n / 2, cnt + 1 + n % 2), recursive(n / 3, cnt + 1 + n % 3));
	}
}