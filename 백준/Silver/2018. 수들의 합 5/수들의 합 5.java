import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.parseInt(br.readLine());
		
		int ans = 1;// N 포함

		for(int div=2; div<=N; div++) { // div: 연속된 자연수의 개수
			int res = N / div; // res: 연속된 자연수 중 중간에 해당하는 숫자
			int remain = N % div; 
			int startNum = res - div / 2; // 연속된 자연수의 맨 처음 숫자
			if(div % 2 == 0) {
				startNum++; // 연속된 자연수의 개수가 짝수일 경우, res가 정확히 중간의 숫자가 아니므로 1을 더함
			}
			if(startNum < 1) {
				break; // 연속된 자연수의 맨 처음 숫자가 1보다 작으면 이후 탐색은 무의미
			}
			if(div % 2 == 0 && remain == div / 2) {// div가 짝수이면 나머지가 div/2만큼 있어야 등차 수열 완성 -> res-1, res, res+1, res+2 ...
				ans++;
			}
			if(div % 2 == 1 && remain == 0) {// div가 홀수이면 나머지가 없어야 등차 수열 완성 -> res-1, res, res+1 ...
				ans++;
			}
		}
		
		sb.append(ans);
		
		System.out.println(sb);
	}
	
}