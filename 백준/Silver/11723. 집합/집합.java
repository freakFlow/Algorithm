import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int M;
	static int set;
	
	public static void main(String[] args) throws IOException {
		
		M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
			case "add":
				set |= 1 << Integer.parseInt(st.nextToken());
				break;
			case "remove":
				set &= ~(1 << Integer.parseInt(st.nextToken()));
				break;
			case "check":
				sb.append(((set & (1 << Integer.parseInt(st.nextToken()))) > 0) ? 1 : 0).append('\n');
				break;
			case "toggle":
				set ^= 1 << Integer.parseInt(st.nextToken());
				break;
			case "all":
				set = 2097151; // 0b 1_1111_1111_1111_1111_1111
				break;
			case "empty":
				set = 0;
				break;
			}
		}
		
		System.out.println(sb);
	}
	
}