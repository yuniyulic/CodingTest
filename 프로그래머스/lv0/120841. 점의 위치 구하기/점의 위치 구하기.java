class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        
        if (x > 0 && y > 0) {answer=1;}
        if (x < 0 && y > 0) {answer=2;}
        if (x < 0 && y < 0) {answer=3;}
        if (x > 0 && y < 0) {answer=4;}
        
        return answer;
    }
}