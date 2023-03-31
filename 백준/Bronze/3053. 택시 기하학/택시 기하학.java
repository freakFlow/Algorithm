import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int r;
	
	public static void main(String[] args) throws IOException {
		
		r = Integer.parseInt(br.readLine());
		sb.append(Math.PI * r * r).append('\n').append(r * r * 2);
			
		System.out.println(sb);
	}
	
}