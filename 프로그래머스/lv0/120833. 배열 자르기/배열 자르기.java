import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[numbers.length];
        
        //Arrays.copyOf(복사할 배열, 복사할 배열의 크기)
        //Arrays.copyOfRange(복사할 배열, 시작 위치, 배열 크기)
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
       
        return answer;
    }
}
