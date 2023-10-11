import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.toLowerCase().split("")));
        
        int cntP = 0;
        int cntY = 0;
        
        for (String str : list) {
            if ("p".equals(str)) {
                cntP++;        
            } else if ("y".equals(str)) {
                cntY++;
            }
        }
        
        if (cntP != cntY) {
            answer = false;
        }
        
        return answer;
    }
}