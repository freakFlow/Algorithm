import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        int length = intStrs.length;
        
        for(int i=0; i<length; i++){
            String str = intStrs[i];
            int num = Integer.parseInt(str.substring(s, s + l));
            if(num > k) list.add(num);
        }
        
        int size = list.size();
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}