class Solution {
    static int mode = 0;
    
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<code.length(); i++){
            char ch = code.charAt(i);
            if(ch == '1'){
                mode ^= 1;
            }else if(mode == 0){
                if(i % 2 == 0) sb.append(ch);
            }else{
                if(i % 2 != 0) sb.append(ch);
            }
        }
        
        return (sb.length() == 0) ? "EMPTY" : sb.toString();
    }
}