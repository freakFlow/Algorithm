import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int[] nums = new int[4];
	
	public static void main(String[] args) throws IOException{
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		sb.append(Math.abs((nums[3]+nums[0]) - (nums[2]+nums[1])));
		
		System.out.println(sb);
	}
	
}