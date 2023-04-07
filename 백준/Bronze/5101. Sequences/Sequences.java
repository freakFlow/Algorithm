import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int first, diff, num;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			first = Integer.parseInt(st.nextToken());
			diff = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			if(diff == 0) break;
			
			if((first < num && diff > 0) || (first > num && diff < 0)) {
				if((num - first) % diff == 0) {
					sb.append((num - first) / diff + 1);
				}else {
					sb.append('X');
				}
			}else if(first == num){
				sb.append(1);
			}else {
				sb.append('X');
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}