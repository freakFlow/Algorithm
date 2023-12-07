class Solution {
    static int[] delta = {-1, 0, 1};
    
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    for(int k=0; k<delta.length; k++){
                        for(int l=0; l<delta.length; l++){
                            int newX = i + delta[k];
                            int newY = j + delta[l];
                            if(newX < 0 || newY < 0 || newX >= n || newY >= n) continue;
                            if(board[newX][newY] == 1) continue;
                            board[newX][newY] = 2;
                        }
                    }
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] > 0) continue;
                answer++;
            }
        }
        
        return answer;
    }
}