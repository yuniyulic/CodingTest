class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        //length() 함수 사용
        
        for (int i=0; i<strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}