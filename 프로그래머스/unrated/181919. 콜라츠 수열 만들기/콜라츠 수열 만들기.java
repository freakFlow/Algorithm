import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = n * 3 + 1;
            }
            list.add(n);
        }
        int size = list.size();
        
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}