import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    static Set<String> treeName;
    static Map<String, Integer> treeCount;
    static List<String> sorted;
    static int total;

    public static void main(String[] args) throws IOException {
        treeName = new HashSet<>();
        treeCount = new HashMap<>();

        String str = br.readLine();
        while(str != null){
            total++;
            treeName.add(str);
            int count = treeCount.getOrDefault(str, 0);
            treeCount.put(str, count + 1);
            str = br.readLine();
        }

        sorted = new ArrayList<>(treeName);
        Collections.sort(sorted);

        for(String name : sorted){
            sb.append(name).append(String.format(" %.4f\n", (double)treeCount.get(name) / total * 100));
        }

        System.out.print(sb);
    }

}