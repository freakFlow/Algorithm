class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public int combination(int r, int c){
        if(r == c) return 1;
        if(c == 0) return 1;
        
        return combination(r-1, c) + combination(r-1, c-1);
    }
}