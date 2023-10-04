import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int num, int k) {
        int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        
        int answer = -1;
        int idx = 1;
        
        for (int n : digits) {
            if (n == k) {
                answer = idx;
                break;
            }
            idx++;
        }
        
        return answer;
    }
}