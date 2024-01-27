import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int INF = Integer.MAX_VALUE;
    static int N, M;
    static int start, end;
    static List<Bus>[] graph;
    static PriorityQueue<City> pQueue;
    static boolean[] visited;
    static int[] total;

    static class Bus{
        int toCity;
        int fee;

        Bus(int toCity, int fee){
            this.toCity = toCity;
            this.fee = fee;
        }
    }

    static class City{
        int city;
        int total;

        City(int city, int total){
            this.city = city;
            this.total = total;
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        graph = new List[N + 1];
        pQueue = new PriorityQueue<>(new Comparator<City>() {
            @Override
            public int compare(City o1, City o2) {
                return Integer.compare(o1.total, o2.total);
            }
        });
        visited = new boolean[N + 1];
        total = new int[N + 1];
        for(int n=1; n<=N; n++){
            graph[n] = new ArrayList<>();
            total[n] = INF;
        }

        for(int m=0; m<M; m++){
            st = new StringTokenizer(br.readLine());
            int s, e, w;
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            graph[s].add(new Bus(e, w));
        }

        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        pQueue.add(new City(start, 0));
        total[start] = 0;
        while(!pQueue.isEmpty()){
            City current = pQueue.poll();
            if(visited[current.city]) continue;
            visited[current.city] = true;

            for(Bus bus : graph[current.city]){
                if(total[current.city] + bus.fee < total[bus.toCity]){
                    total[bus.toCity] = total[current.city] + bus.fee;
                    pQueue.add(new City(bus.toCity, total[bus.toCity]));
                }
            }
        }

        sb.append(total[end]);

        System.out.print(sb);
    }

}
