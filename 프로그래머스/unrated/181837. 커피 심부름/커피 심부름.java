class Solution {
    static final int AME = 4500;
    static final int LATTE = 5000;
    
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i=0; i<order.length; i++){
            if(order[i].contains("cafe")){
                answer += LATTE;
                continue;
            }
            
            answer += AME;
        }
        
        return answer;
    }
}