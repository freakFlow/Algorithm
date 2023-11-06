import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        Arrays.sort(num_list);
        
        int[] answer = new int[length - 5];
        for(int i=0; i<answer.length; i++){
            answer[i] = num_list[i + 5];
        }
        
        return answer;
    }
}