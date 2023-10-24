class Solution {
    public int solution(String number) {
        int sum = 0;
        int length = number.length();
        
        for(int i=0; i<length; i++){
            sum += number.charAt(i) - '0';
        }
        
        return sum % 9;
    }
}