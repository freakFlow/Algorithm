import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int[] nums = new int[3];
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = check();
		if(res == -1) {
			sb.append('*');
		}else {
			sb.append((char)('A' + res));
		}
		
		System.out.println(sb);
	}
	
	static int check() {
		if(nums[0] == nums[1]) {
			if(nums[0] == nums[2]) {
				return -1;
			}else {
				return 2;
			}
		}else if(nums[0] == nums[2]) {
			return 1;
		}else {
			return 0;
		}
	}
}