import java.util.*;

class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
        int subLen = 0;
        for(int i=0; i<myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch == 'x'){
                list.add(subLen);
                subLen = 0;
            }else{
                subLen++;
            }
        }
        list.add(subLen);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}