class Solution {
    public int solution(String[] strArr) {
        int[] counts = new int[31];
        
        for(int i=0; i<strArr.length; i++){
            counts[strArr[i].length()]++;
        }
        
        int max = 0;
        for(int i=0; i<counts.length; i++){
            if(counts[i] > max){
                max = counts[i];
            }
        }
        
        return max;
    }
}