import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] strArr = s.split("");
        Map<String, Integer> strMap = new HashMap<>();
        
        // strArr의 길이만큼 반복
        for (int i=0; i<strArr.length; i++) {
            // 해당 문자가 strMap에 없으면 -1
            if (strMap.get(strArr[i]) == null) {
                answer[i] = -1;
            } else {
                // 해당 문자가 strMap에 있으면 i - 이전 문자의 인덱스
                answer[i] = i - strMap.get(strArr[i]);
            }
            strMap.put(strArr[i], i); // 해당 문자는 strMap에 넣는다. (이후에 조회하기 위해서)
        }
        
        return answer;
    }
}