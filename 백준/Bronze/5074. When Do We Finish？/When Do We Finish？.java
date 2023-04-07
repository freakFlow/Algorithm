import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int sh, sm;
	static int dh, dm;
	static int day;
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			st = new StringTokenizer(br.readLine(), ": ");
			sh = Integer.parseInt(st.nextToken());
			sm = Integer.parseInt(st.nextToken());
			dh = Integer.parseInt(st.nextToken());
			dm = Integer.parseInt(st.nextToken());
			
			if(sh + sm + dh + dm == 0) break;
			
			sm += dm;
			if(sm >= 60) {
				sh++;
				sm -= 60;
			}
			
			sh += dh;
			if(sh >= 24) {
				day = sh / 24;
				sh %= 24;
			}else{
                day = 0;
            }
			
			sb.append(String.format("%02d:%02d", sh, sm));
			if(day > 0) {
				sb.append(" +").append(day);
			}
			sb.append('\n');
		}
		
		System.out.println(sb);
	}
}