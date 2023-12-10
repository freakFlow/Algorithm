class Solution {
    public int solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int gcd = getGcd(max, min);
        
        a /= gcd;
        b /= gcd;
        
        while(b % 2 == 0){
            b /= 2;
        }
        while(b % 5 == 0){
            b /= 5;
        }
        
        return (b == 1) ? 1 : 2;
    }
    
    int getGcd(int a, int b){
        if(a % b == 0) return b;
        
        return getGcd(b, a % b);
    }
}