class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        
        sb.append(a).append(b);
        int aCalB = Integer.parseInt(sb.toString());
        int max = 2 * a * b;
        
        return (aCalB >= max) ? aCalB : max;
    }
}