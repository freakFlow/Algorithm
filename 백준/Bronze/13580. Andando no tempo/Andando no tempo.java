import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int[] jumpYear = new int[3];

	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<jumpYear.length; i++) {
			jumpYear[i] = Integer.parseInt(st.nextToken());
		}
		
		sb.append((canReturn(jumpYear)) ? 'S' : 'N');
		
		System.out.println(sb);
	}
	
	static boolean canReturn(int[] jumpYear) {
		Arrays.sort(jumpYear);
		
		if(jumpYear[0] == jumpYear[1] || jumpYear[1] == jumpYear[2]) {
			return true;
		}
		if(jumpYear[0] + jumpYear[1] == jumpYear[2]) {
			return true;
		}
		
		return false;
	}
}