class Solution {
    public int solution(int n) {
        int answer = 0;
        // Math.sqrt() 사용
        // 제곱근 반환
        double sqrtValue = Math.sqrt(n);
        
        if (n == (int)sqrtValue*sqrtValue) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}
