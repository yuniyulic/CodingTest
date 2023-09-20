class Solution {
    public int solution(String my_string) {
        char[] ch = my_string.toCharArray();
        String str = "";
        
        for (int i=0; i<ch.length; i++) {
            if (49 <= ch[i] && ch[i] <= 57) {
                str += ch[i];
            }
        }
        
        int answer = 0;
        String[] strArr = str.split("");
        
        for (int i=0; i<strArr.length; i++) {
            answer += Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}