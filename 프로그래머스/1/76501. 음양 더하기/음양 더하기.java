class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i=0; i<absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] = absolutes[i] * -1;
            }
        }
        
        for (int i : absolutes) {
            answer = answer + i;
        }
        
        return answer;
    }
}