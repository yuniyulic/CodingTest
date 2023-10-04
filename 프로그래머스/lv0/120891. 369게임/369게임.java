import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int cnt = 0;
        int[] digits = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        
        for (int num : digits) {
            if (num != 0 && num % 3 == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}