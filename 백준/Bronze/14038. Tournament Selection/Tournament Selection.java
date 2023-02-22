import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int win;
	
	public static void main(String[] args) throws IOException{
		
		for(int i=0; i<6; i++) {
			if(br.readLine().equals("W")){
				win++;
			}
		}
		
		if(win >= 5) {
			sb.append(1);
		}else if(win >= 3) {
			sb.append(2);
		}else if(win >= 1) {
			sb.append(3);
		}else {
			sb.append(-1);
		}
		
		System.out.println(sb);
	}
	
	
}