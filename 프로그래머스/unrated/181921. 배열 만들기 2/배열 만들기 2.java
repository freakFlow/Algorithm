import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answerList = new ArrayList<>();
        
        for(int n=l; n<=r; n++){
            if(n % 5 != 0) continue;
            
            if(isElement(n)){
                answerList.add(n);
            }
        }
        
        if(answerList.size() == 0) answerList.add(-1);
        
        return listToArr(answerList);
    }
    
    public int[] listToArr(List<Integer> list){
        int size = list.size();
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public boolean isElement(int num){
        while(num != 0){
            int remain = num % 10;
            if(remain != 0 && remain != 5){
                return false;
            }
            num /= 10;
        }
        
        return true;
    }
}