import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        //옷 종류별 개수
        for(String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) +1);
        }
        
        for(Integer i : map.values()) {
            answer *= i.intValue() + 1;
        }
        
        return answer-1;
    }
}