class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        
        for(int i=0; i<num_list.length; i++){
            sum += makeOne(num_list[i]);
        }
        
        return sum;
    }
    
    public int makeOne(int num){
        int iter = 0;
        
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num - 1) / 2;
            }
            iter++;
        }
        
        return iter;
    }
}