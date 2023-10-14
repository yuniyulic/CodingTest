import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        answer = String.join("", arr);
        
        return Long.parseLong(answer);
    }
}