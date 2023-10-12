class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb1.append(a).append(b);
        sb2.append(b).append(a);
        
        int aCalcB = Integer.parseInt(sb1.toString());
        int bCalcA = Integer.parseInt(sb2.toString());
        
        return (aCalcB > bCalcA) ? aCalcB : bCalcA;
    }
}