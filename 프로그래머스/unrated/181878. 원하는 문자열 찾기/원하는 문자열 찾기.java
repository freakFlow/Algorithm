class Solution {
    public int solution(String myString, String pat) {
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        return (lowerMyString.contains(lowerPat)) ? 1 : 0;
    }
}