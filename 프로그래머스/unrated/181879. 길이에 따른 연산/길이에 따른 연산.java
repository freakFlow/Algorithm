class Solution {
    public int solution(int[] num_list) {
        int length = num_list.length;
        
        if(length > 10){
            int sum = 0;
            for(int i=0; i<length; i++){
                sum += num_list[i];
            }
            
            return sum;
        }else{
            int mul = 1;
            for(int i=0; i<length; i++){
                mul *= num_list[i];
            }
            
            return mul;
        }
    }
}