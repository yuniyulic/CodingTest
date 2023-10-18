class Solution {
    public int solution(int num) {
        int answer = 0;
        long l = (long)num;
        
        if (l == 1) {
            answer = 0;
            return answer;
        }
        
        for (int i=0; i<500; i++) {
            if (l % 2 == 0) {
                l = l / 2;
            } else {
                l = l * 3 + 1;
            }
            answer++;
            
            if (l == 1) {
                break;
            }
        }
        
        if (answer == 500) {
            answer = -1;
        }
        
        return answer;
    }
}