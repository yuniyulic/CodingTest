import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        return Arrays.stream(numlist) //numlist 배열을 stream으로 변환
                     .filter(item -> item % n == 0) //n의 배수인 수만 남긴다
                     .toArray(); //다시 배열로 변환
    }
}