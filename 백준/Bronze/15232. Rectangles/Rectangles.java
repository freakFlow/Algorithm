import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int R, C;
	
	public static void main(String[] args) throws IOException {
		
		R = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		
		for(int r=0; r<R; r++) {
			for(int c=0; c<C; c++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}