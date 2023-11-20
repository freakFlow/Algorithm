class Solution {
    public String solution(String n_str) {
        StringBuilder sb = new StringBuilder();
        boolean filter = true;
        for(int i=0; i<n_str.length(); i++){
            if(filter && n_str.charAt(i) == '0') continue;
            filter = false;
            sb.append(n_str.charAt(i));
        }
        
        return sb.toString();
    }
}