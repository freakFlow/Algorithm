class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total - num + 1;
        int end = total;
        
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum += i;
        }
        
        while(sum != total){
            if(sum < total){
                sum -= start++;
                sum += ++end;
            }else{
                sum += --start;
                sum -= end--;
            }
        }
        
        for(int i=0; i<num; i++){
            answer[i] = start++;
        }
        
        return answer;
    }
}