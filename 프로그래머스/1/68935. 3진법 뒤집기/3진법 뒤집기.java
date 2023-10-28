import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }
        
        for (int i=0; i<list.size(); i++) {
            str += list.get(i) + "";
        }
        
        answer = Integer.parseInt(str, 3);
        
        return answer;
        
    }
}