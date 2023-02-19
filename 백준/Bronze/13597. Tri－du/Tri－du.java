import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int A, B;

	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		
		if(A == B) {
			sb.append(A);
		}else {
			sb.append((A > B) ? A : B);
		}
		
		System.out.println(sb);
	}
	
}