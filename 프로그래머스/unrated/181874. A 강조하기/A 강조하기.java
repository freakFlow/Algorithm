class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch == 'a'){
                sb.append('A');
            }else if('A' <= ch && ch <= 'Z'){
                if(ch == 'A') sb.append('A');
                else sb.append((char) (ch + 'a' - 'A'));
            }else{
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}