class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String myStrArr[] = my_string.split("");
        
        for (int i=0; i<myStrArr.length; i++) {
            for (int j=0; j<n; j++) {
                answer += myStrArr[i];
            }
        }
        
        return answer;
    }
}