import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int a1, p1, r1, p2;
	
	public static void main(String[] args) throws IOException {
		
		st = new StringTokenizer(br.readLine());
		a1 = Integer.parseInt(st.nextToken());
		p1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		r1 = Integer.parseInt(st.nextToken());
		p2 = Integer.parseInt(st.nextToken());
		
		if((double)a1 / p1 > Math.PI * r1 * r1 / p2) {
			sb.append("Slice of pizza");
		}else {
			sb.append("Whole pizza");
		}
		
		System.out.println(sb);
	}
}