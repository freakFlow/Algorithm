class Solution {
    public int solution(int[][] dots) {
        
        for(int i=0; i<4; i++){
            for(int j=i + 1; j<4; j++){
                double angle1 = (double)(dots[j][1] - dots[i][1]) / (dots[j][0] - dots[i][0]);
                int x = -1, y = -1;
                for(int k=0; k<4; k++){
                    if(k == i || k == j) continue;
                    if(x == -1){
                        x = dots[k][0];
                        y = dots[k][1];
                    }else{
                        x -= dots[k][0];
                        y -= dots[k][1];
                    }
                }
                
                if(Math.abs(angle1 - (double)y / x) < Math.pow(10, -10)) return 1;
            }
        }
        
        return 0;
    }
}