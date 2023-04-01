import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int T;
	static String comName;
	
	public static void main(String[] args) throws IOException {
		
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; t++) {
			comName = br.readLine();
			sb.append((isPalindrome(toNum(comName))) ? "YES" : "NO").append('\n');
		}
			
		System.out.println(sb);
	}
	
	static String toNum(String name) {
		name = name.toUpperCase();
		StringBuilder num = new StringBuilder();
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) <= 'O') {
				num.append((char)('2' + (name.charAt(i) - 'A') / 3));
			}else if(name.charAt(i) <= 'S'){
				num.append('7');
			}else if(name.charAt(i) <= 'V') {
				num.append('8');
			}else {
				num.append('9');
			}
		}
		return num.toString();
	}
	
	static boolean isPalindrome(String num) {
		int left = 0;
		int right = num.length()-1;
		while(left < right) {
			if(num.charAt(left++) != num.charAt(right--)) {
				return false;
			}
		}
		return true;
	}
}