import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static int n;
	static int m;
	static int[] inputs;
	
	public static void main(String[] args) throws IOException {
		
		n = nextInt();
		inputs = new int[n+1];
		for(int i=1; i<inputs.length; i++) {
			inputs[i] = nextInt();
		}
		
		m = nextInt();
		for(int i=0; i<m; i++) {
			int oper = nextInt();
			int left = nextInt();
			int right = nextInt();
			if(oper == 1) {
				for(int j=left; j<=right; j++) {
					inputs[j] = inputs[j] * inputs[j] % 2010;
				}
			}else {
				int sum = 0;
				for(int j=left; j<=right; j++) {
					sum += inputs[j];
				}
				
				sb.append(sum).append('\n');
			}
		}
		
		System.out.println(sb);
	}
	
	static final int BUFFER_SIZE = 1 << 10;
	static byte[] buffer = new byte[BUFFER_SIZE];
	static int length, idx;
	
	static int nextInt() throws IOException {
		int num = 0;
		byte b = read();
		while(b<=32) b = read();
		do {
			num = num * 10 + b - '0';
		}while(isNumber(b = read()));
		
		return num;
	}
	
	static boolean isNumber(byte b) {
		return b>='0' && b<='9';
	}
	
	static byte read() throws IOException {
		if(length == idx) {
			length = System.in.read(buffer, idx = 0, BUFFER_SIZE);
			if(length == -1) {
				buffer[0] = -1;
			}
		}
		return buffer[idx++];
	}
	
}