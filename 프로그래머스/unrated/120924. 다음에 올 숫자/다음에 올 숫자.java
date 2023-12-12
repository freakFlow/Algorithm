class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int d = common[1] - common[0];
        int r = 0;
        if(common[0] != 0){
            r = common[1] / common[0];
        }
        
        
        if(common[1] + d == common[2]){
            answer = common[common.length - 1] + d;
        }else{
            answer = common[common.length - 1] * r;
        }
        
        return answer;
    }
}