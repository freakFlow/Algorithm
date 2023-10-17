class Solution {
    public int solution(int n, String control) {
        int[] count = new int[2];
        
        for(int i=control.length()-1; i>=0; i--){
            switch(control.charAt(i)){
                case 'w':
                    count[0]++;
                    break;
                case 's':
                    count[0]--;
                    break;
                case 'd':
                    count[1]++;
                    break;
                case 'a':
                    count[1]--;
                    break;
            }
        }
        
        return n + count[0] + 10 * count[1];
    }
}