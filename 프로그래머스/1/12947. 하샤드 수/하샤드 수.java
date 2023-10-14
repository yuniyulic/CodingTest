import java.util.*;
import java.util.stream.Stream;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int[] digits = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        
        
        for(int i : digits) {
            sum += i;
        }
        
        if(x % sum != 0) {
            answer = false;
        }
                
        return answer;
    }
}