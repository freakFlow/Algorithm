import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static final double LITER = 3.785411784;
	static final double METER = 1609.344;
	static double x;
	
	public static void main(String[] args) throws IOException {
		
		x = Double.parseDouble(br.readLine());
		
		sb.append((1/x) * LITER / METER * 100000);
		
		System.out.println(sb);
	}
	
}