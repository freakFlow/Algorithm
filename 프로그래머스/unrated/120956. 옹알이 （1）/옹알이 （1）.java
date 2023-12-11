class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            boolean canSpeak = true;
            String word = babbling[i];
            for(int j=0; j<word.length(); ){
                switch(word.charAt(j)){
                    case 'a':
                        if(j + 3 > word.length() || !word.substring(j, j+3).equals("aya")) canSpeak = false;
                        j += 3;
                        break;
                    case 'y':
                        if(j + 2 > word.length() || !word.substring(j, j+2).equals("ye")) canSpeak = false;
                        j += 2;
                        break;
                    case 'w':
                        if(j + 3 > word.length() || !word.substring(j, j+3).equals("woo")) canSpeak = false;
                        j += 3;
                        break;
                    case 'm':
                        if(j + 2 > word.length() || !word.substring(j, j+2).equals("ma")) canSpeak = false;
                        j += 2;
                        break;
                    default:
                        j++;
                        canSpeak = false;
                }
            }
            if(canSpeak) answer++;
        }
        
        return answer;
    }
}