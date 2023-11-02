class Solution {
    public String solution(String myString, String pat) {
        int length = myString.length();
        int patLength = pat.length();
        int diff = length - patLength;
        
        int i=0;
        for(; i<=diff; i++){
            if(myString.substring(length-i-patLength,length-i).equals(pat)){
                break;
            }
        }
        
        return myString.substring(0, length-i);
    }
}