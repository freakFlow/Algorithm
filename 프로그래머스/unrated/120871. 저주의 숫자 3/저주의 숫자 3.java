class Solution {
    public int solution(int n) {
        int numOfTown = 0;
        
        for(int i=0; i<n; i++){
            numOfTown++;
            while(isSkip(numOfTown)){
                numOfTown++;
            }
        }
        
        return numOfTown;
    }
    
    boolean isSkip(int num){
        if(num % 3 == 0) return true;
        while(num > 0){
            if(num % 10 == 3) return true;
            num /= 10;
        }
        
        return false;
    }
}