import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static final double PI = 3.141592;
	static int d1, d2;
	
	public static void main(String[] args) throws IOException {
		
		d1 = Integer.parseInt(br.readLine());
		d2 = Integer.parseInt(br.readLine());
		
		sb.append(2 * (d1 + PI * d2));
		
		System.out.println(sb);
	}
}