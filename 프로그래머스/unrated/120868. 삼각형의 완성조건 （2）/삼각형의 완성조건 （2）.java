class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxSide = Math.max(sides[0], sides[1]);
        int minSide = Math.min(sides[0], sides[1]);
        
        // 가장 긴 변이 sides에 없을 경우
        answer += minSide;
        
        // 가장 긴 변이 sides에 있을 경우
        answer += minSide - 1;
        
        return answer;
    }
}