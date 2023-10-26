import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length(); //문자열 s의 길이
        
        if((len == 4 || len == 6) && s.matches("^[0-9]*$")) { //문자열 s의 길이가 4 혹은 6이고 숫자로만 구성돼있으면 true
            answer = true;
        }
        
        return answer;
    }
}