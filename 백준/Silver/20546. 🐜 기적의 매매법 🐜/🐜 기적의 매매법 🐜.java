import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static final int DAY = 14;

    static int cash;
    static int[] prices;
    static int bnp, timing;

    public static void main(String[] args) throws IOException {
        cash = Integer.parseInt(br.readLine());
        prices = new int[DAY];

        st = new StringTokenizer(br.readLine());
        for(int d=0; d<DAY; d++){
            prices[d] = Integer.parseInt(st.nextToken());
        }

        bnp = goBnp();
        timing = goTiming();
        
        if(bnp == timing) sb.append("SAMESAME");
        else sb.append(bnp > timing ? "BNP" : "TIMING");

        System.out.print(sb);
    }

    static int goBnp(){
        int bnpCash = cash;
        int stock = 0;

        for(int d=0; d<DAY; d++){
            int today = prices[d];
            if(bnpCash < today) continue;

            stock += bnpCash / today;
            bnpCash %= today;
        }

        return bnpCash + stock * prices[DAY-1];
    }

    static int goTiming(){
        int timingCash = cash;
        int stock = 0;

        int[] diff = new int[DAY];

        for(int d=1; d<DAY; d++){
            int temp = prices[d] - prices[d-1];
            if(temp == 0) diff[d] = 0;
            else diff[d] = temp > 0 ? 1 : -1;
        }

        int count = 0;
        for(int d=1; d<DAY; d++){
            if(count * diff[d] <= 0) {
                count = diff[d];
                continue;
            }
            count += diff[d];

            if(count >= 3){
                timingCash += stock * prices[d];
                stock = 0;
            }

            if(count <= -3 && timingCash >= prices[d]){
                stock += timingCash / prices[d];
                timingCash %= prices[d];
            }
        }

        return timingCash + stock * prices[DAY-1];
    }
}