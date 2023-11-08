import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length; //배열 길이 저장
     
        //HashSet 사용 -> 중복 제거
        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));

        int setLen = set.size();
        
        //최대치가 n/2 
        //인데 setLen이 우선
        
        if (len/2 <= setLen) {
            answer = len/2;
        } else {
            answer = setLen;
        }
        
        return answer;
    }
}