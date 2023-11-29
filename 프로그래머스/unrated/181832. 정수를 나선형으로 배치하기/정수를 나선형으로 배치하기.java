class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] checked = new boolean[n][n];
        
        int num = 1;
        int row = 0, col = 0;
        while(num <= n * n){
            while(col < n){
               if(checked[row][col]) break;
                
                answer[row][col] = num++;
                checked[row][col++] = true;
            }
            col--;
            row++;
            
            while(row < n){
                if(checked[row][col]) break;
                
                answer[row][col] = num++;
                checked[row++][col] = true;
            }
            row--;
            col--;
            
            while(col >= 0){
                if(checked[row][col]) break;
                
                answer[row][col] = num++;
                checked[row][col--] = true;
            }
            col++;
            row--;
            
            while(row >= 0){
                if(checked[row][col]) break;
                
                answer[row][col] = num++;
                checked[row--][col] = true;
            }
            row++;
            col++;
        }
        
        return answer;
    }
}