import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    
    static int p, s;
    static int hole;
    
    public static void main(String[] args) throws IOException {
		
    	while(true) {
    		st = new StringTokenizer(br.readLine());
    		p = Integer.parseInt(st.nextToken());
    		s = Integer.parseInt(st.nextToken());
    		if(p == 0) break;
    		
    		sb.append("Hole #").append(++hole).append('\n');
    		if(s == 1) {
    			sb.append("Hole-in-one.");
    		}else {
    			int diff = s - p;
    			if(diff == 0) {
    				sb.append("Par.");
    			}else if(diff < 0) {
    				if(diff == -1) {
    					sb.append("Birdie.");
    				}else {
    					sb.append((diff == -2) ? "Eagle." : "Double eagle.");
    				}
    			}else {
    				sb.append((diff == 1) ? "Bogey." : "Double Bogey.");
    			}
    		}
    		
    		sb.append("\n\n");
    	}
    	
    	System.out.println(sb);
	}
}