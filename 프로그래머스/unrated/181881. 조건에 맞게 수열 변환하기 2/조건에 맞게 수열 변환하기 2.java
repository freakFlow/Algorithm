class Solution {
    public int solution(int[] arr) {
        int length = arr.length;
        
        boolean flag = false;
        int iter = 0;
        while(!flag){
            flag = true;
            iter++;
            
            for(int i=0; i<length; i++){
                int num = arr[i];
                if(num < 50){
                    if(num % 2 == 1){
                        flag = false;
                        arr[i] = num * 2 + 1;
                    }
                }else{
                    if(num % 2 == 0){
                        arr[i] = num / 2;
                    }
                }
            }
        }
        
        
        return iter - 1;
    }
}