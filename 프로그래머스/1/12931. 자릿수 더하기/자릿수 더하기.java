import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrNum = new ArrayList<>(); //ArrayList 사용
        
        while(n > 0) {
            arrNum.add(n%10);
            n /= 10;
        }
        
        for(int i : arrNum) {
            answer += i;
        }

        return answer;
    }
}