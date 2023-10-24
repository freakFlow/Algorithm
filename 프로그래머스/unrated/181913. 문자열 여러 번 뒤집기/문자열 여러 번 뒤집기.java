class Solution {
    public String solution(String my_string, int[][] queries) {
        int length = queries.length;
        
        for(int i=0; i<length; i++){
            my_string = flip(my_string, queries[i][0], queries[i][1]);
        }
        
        return my_string;
    }
    
    public String flip(String str, int s, int e){
        StringBuilder returned = new StringBuilder();
        returned.append(str.substring(0, s))
            .append(new StringBuilder(str.substring(s, e + 1)).reverse().toString())
            .append(str.substring(e + 1, str.length()));
        
        return returned.toString();
    }
}