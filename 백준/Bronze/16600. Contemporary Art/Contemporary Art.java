import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static long area;
	
	public static void main(String[] args) throws IOException {
		
		area = Long.parseLong(br.readLine());
		
		sb.append(4 * Math.sqrt(area));
		
		System.out.println(sb);
	}
}