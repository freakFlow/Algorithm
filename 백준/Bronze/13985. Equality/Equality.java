import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int a, b, c;
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		st.nextToken();
		b = Integer.parseInt(st.nextToken());
		st.nextToken();
		c = Integer.parseInt(st.nextToken());
		
		sb.append((a + b == c) ? "YES" : "NO");
		
		System.out.println(sb);
	}
	
	
}