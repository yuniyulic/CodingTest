class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i=0; i<s.length(); i++) {
            int c = s.charAt(i);
            int tmp = 0;
            
            if (c == ' ') {
                answer += ' ';
            } else if ( c <= 90) {
                tmp = (c - 65 + n) % 26;
                answer += (char) (tmp + 65);
            } else {
                tmp = (c - 97 + n) % 26;
                answer += (char) (tmp + 97);
            }
        }
        
        return answer;
    }
}