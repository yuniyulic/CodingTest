import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray(); //문자열 s를 char배열로 변경
        Arrays.sort(arr); //char배열을 오름차순 정렬
        StringBuilder st = new StringBuilder(new String(arr));
        answer = st.reverse().toString(); //reverse()로 내림차순 정렬
        
        return answer;
    }
}