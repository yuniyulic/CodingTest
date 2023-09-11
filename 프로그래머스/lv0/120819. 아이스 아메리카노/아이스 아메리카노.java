class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0] = money / 5500; // 아메리카노 개수
        answer[1] = money % 5500; // 남는 돈
        
        return answer;
    }
}