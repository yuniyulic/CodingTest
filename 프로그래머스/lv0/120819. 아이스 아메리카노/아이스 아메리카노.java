class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        if (money < 5500) {
            answer[0] = 0;
            answer[1] = money;
        } else {
            answer[0] = money / 5500; // 아메리카노 개수
            answer[1] = money % 5500; // 남는 돈
        }
        
        return answer;
    }
}