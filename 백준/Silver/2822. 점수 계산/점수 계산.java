import java.io.*;
import java.util.*;

import javax.swing.event.ListDataListener;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer st;
	
	static Problem[] problem = new Problem[8];
	static Problem[] choosed;
	static int sum;
	
	public static void main(String[] args) throws IOException {
		
		for(int i=0; i<problem.length; i++) {
			problem[i] = new Problem(Integer.parseInt(br.readLine()), i+1);
		}
		
		Arrays.sort(problem, new Comparator<Problem>() {

			@Override
			public int compare(Problem o1, Problem o2) {
				return Integer.compare(o1.score, o2.score) * -1;
			}
			
		});
		
		choosed = Arrays.copyOf(problem, 5);
		for(int i=0; i<choosed.length; i++) {
			sum += choosed[i].score;
		}
		
		Arrays.sort(choosed, new Comparator<Problem>() {

			@Override
			public int compare(Problem o1, Problem o2) {
				return Integer.compare(o1.idx, o2.idx);
			}
			
		});
		
		sb.append(sum).append('\n');
		for(int i=0; i<choosed.length; i++) {
			sb.append(choosed[i].idx).append(' ');
		}
		
		
		System.out.println(sb);
	}
	
}

class Problem{
	int score;
	int idx;
	
	Problem(int score, int idx){
		this.score = score;
		this.idx = idx;
	}
}