class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=n; n>0; n--) {
            if (n%2 == 0) {
                answer += n;
            }
        }

        return answer;
    }
}