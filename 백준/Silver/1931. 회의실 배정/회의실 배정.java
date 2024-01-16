import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static int N;
    static PriorityQueue<Meeting> pq;
    static int answer;

    static class Meeting{
        int start;
        int end;

        Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        pq = new PriorityQueue<>(new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end == o2.end){
                    return Integer.compare(o1.start, o2.start);
                }
                return Integer.compare(o1.end, o2.end);
            }
        });

        for(int n=0; n<N; n++){
            st = new StringTokenizer(br.readLine());
            pq.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        int end = 0;
        while(!pq.isEmpty()){
            Meeting meeting = pq.poll();
            if(meeting.start < end) continue;

            answer++;
            end = meeting.end;
        }

        System.out.print(answer);
    }

}
