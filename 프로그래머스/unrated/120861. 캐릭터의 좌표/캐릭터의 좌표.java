class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] position = new int[2];
        int maxRight = board[0] / 2;
        int maxLeft = -maxRight;
        int maxUp = board[1] / 2;
        int maxDown = -maxUp;
        
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "left":
                    position[0] -= 1;
                    position[0] = Math.max(maxLeft, position[0]);
                    break;
                case "right":
                    position[0] += 1;
                    position[0] = Math.min(maxRight, position[0]);
                    break;
                case "up":
                    position[1] += 1;
                    position[1] = Math.min(maxUp, position[1]);
                    break;
                case "down":
                    position[1] -= 1;
                    position[1] = Math.max(maxDown, position[1]);
                    break;
            }
        }
        
        return position;
    }
}