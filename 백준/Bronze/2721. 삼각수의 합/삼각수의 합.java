import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int T;
	static long n;
	
	public static void main(String[] args) throws IOException{
		
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			n = Long.parseLong(br.readLine());
			sb.append(n*(n+1)*(n+2)*(n+3) / 8).append('\n');
		}
		
		System.out.println(sb);
	}
	
}