import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int n1, n2;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			n1 = Integer.parseInt(st.nextToken());
			n2 = Integer.parseInt(st.nextToken());
			if(n1 + n2 == 0) break;
			
			if(n1 % n2 == 0) {
				sb.append("multiple");
			}else if(n2 % n1 == 0) {
				sb.append("factor");
			}else {
				sb.append("neither");
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}