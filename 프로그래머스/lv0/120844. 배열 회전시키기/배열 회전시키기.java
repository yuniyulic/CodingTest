class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int len = answer.length;
        
        //right냐 left냐 분기처리
        //반복문...
        
        if (direction.equals("right")) {
            answer[0] = numbers[len-1];
            
            for (int i=1; i<len; i++) {
                answer[i] = numbers[i-1];
            }
        } else {
            answer[len-1] = numbers[0];
            
            for (int i=0; i<len-1; i++) {
                answer[i] = numbers[i+1];
            }
        }
        
        return answer;
    }
}