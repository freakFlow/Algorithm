import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int T;
	static String str;
	static boolean[] alphabets;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			str = br.readLine();
			alphabets = new boolean[26];
			for(int i=0; i<str.length(); i++) {
				alphabets[str.charAt(i) - 'A'] = true;
			}
			int sum = 0;
			for(int i=0; i<alphabets.length; i++) {
				if(!alphabets[i]) sum += 'A' + i;
			}
			sb.append(sum).append('\n');
		}
			
		System.out.println(sb);
	}
	
}