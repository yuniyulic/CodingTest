class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            if (getDiv(i)!=2 && getDiv(i)!=1) {
                answer++;
            }
        }
        
        return answer;
    }
    
    // 약수의 개수를 찾는 메서드
    public int getDiv(int n) {
        int cnt = 0;
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}