class Solution {
    public String solution(String my_string) {
        String strArr[] = my_string.split("");
        String answer = "";
        
        for (int i=strArr.length-1; i>=0; i--) {
            answer += strArr[i];
        }
        
        return answer;
    }
}