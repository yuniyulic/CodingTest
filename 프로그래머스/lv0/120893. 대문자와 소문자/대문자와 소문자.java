class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        
        for (char ch : charArr) {
            if (Character.isUpperCase(ch)) {
                answer += String.valueOf(Character.toLowerCase(ch));
            } else {
                answer += String.valueOf(Character.toUpperCase(ch));
            }
        }
        
        return answer;
    }
}