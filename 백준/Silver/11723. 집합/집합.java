import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int M;
	static boolean[] set = new boolean[21];
	
	public static void main(String[] args) throws IOException {
		
		M = Integer.parseInt(br.readLine());
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();
			int num = 0;
			if(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}
			
			switch(cmd) {
			case "add":
				set[num] = true;
				break;
			case "remove":
				set[num] = false;
				break;
			case "check":
				sb.append(set[num] ? 1 : 0).append('\n');
				break;
			case "toggle":
				set[num] = !set[num];
				break;
			case "all":
				setAll(true);
				break;
			case "empty":
				setAll(false);
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	static void setAll(boolean b) {
		for(int i=1; i<set.length; i++) {
			set[i] = b;
		}
	}
}