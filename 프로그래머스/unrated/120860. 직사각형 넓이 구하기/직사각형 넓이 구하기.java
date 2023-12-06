class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        
        int lenX = 0, lenY = 0;
        
        for(int i=1; i<dots.length; i++){
            if(dots[i][0] != x) lenX = Math.abs(x - dots[i][0]);
            if(dots[i][1] != y) lenY = Math.abs(y - dots[i][1]);
        }
        
        return lenX * lenY;
    }
}