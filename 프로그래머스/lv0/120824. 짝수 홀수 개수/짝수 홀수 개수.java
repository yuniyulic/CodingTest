class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2]; // 배열 answer 사이즈 지정
        int even = 0; // 짝수
        int odd = 0; // 홀수
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) { // 짝수이면
                even++;
            } else { // 홀수이면
                odd++;
            }
        }
        
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}