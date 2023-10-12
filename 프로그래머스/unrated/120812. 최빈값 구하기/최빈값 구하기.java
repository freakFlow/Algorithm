class Solution {
    public int solution(int[] array) {
        int[] total = new int[1000];
        
        for(int i=0; i<array.length; i++){
            total[array[i]]++;
        }
        
        int index = -1;
        int max = 0;
        
        for(int i=0; i<total.length; i++){
            if(total[i] < max) continue;
            
            if(total[i] == max){
                index = -1;
            }else{
                index = i;
                max = total[i];
            }
        }
        
        return index;
    }
}