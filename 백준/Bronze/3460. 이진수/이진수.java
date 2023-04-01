import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int T;
	static int n;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			n = Integer.parseInt(br.readLine());
			int position = 0;
			while(n > 0) {
				if(n % 2 == 1) sb.append(position).append(' ');
				n /= 2;
				position++;
			}
			sb.append('\n');
		}
			
		System.out.println(sb);
	}
	
}
