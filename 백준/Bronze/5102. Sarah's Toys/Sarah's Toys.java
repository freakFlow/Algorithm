import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int total, missing;
	static int remain;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			total = Integer.parseInt(st.nextToken());
			missing = Integer.parseInt(st.nextToken());
			if(total + missing == 0) break;
			
			remain = total - missing;
			int pairs = 0;
			int isTriple = 0;
			if(remain >= 3 && remain % 2 == 1) {
				isTriple = 1;
				remain -= 3;
			}
			pairs = remain / 2;
			sb.append(pairs).append(' ').append(isTriple).append('\n');
		}
		
		System.out.println(sb);
	}
}