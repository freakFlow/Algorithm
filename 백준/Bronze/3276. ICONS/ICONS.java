import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;	
	
	static int N;
	
	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		int row = 1, col = 1;
		boolean isRow = true;
		while(row * col < N) {
			if(isRow) row++;
			else col++;
			isRow = !isRow;
		}
		
		sb.append(row).append(' ').append(col);
			
		System.out.println(sb);
	}
	
}