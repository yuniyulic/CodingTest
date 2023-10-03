class Solution {
    public String solution(int age) {
        String answer = "";
        String tmp = Integer.toString(age);
        
        for (int i=0; i<tmp.length(); i++) {
            answer += (char) ((char)tmp.charAt(i)+49);
        }
        
        return answer;
    }
}