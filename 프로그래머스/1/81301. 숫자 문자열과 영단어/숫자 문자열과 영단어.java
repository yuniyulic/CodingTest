class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<strArr.length; i++) { // strArr 배열 길이만큼 for문 반복 (10번)
            s = s.replace(strArr[i], Integer.toString(i)); // s에 배열 요소 있으면 인덱스 번호로 바꿔준다.
        }
        
        answer = Integer.parseInt(s); // 문자열 s를 정수로 바꿔서 answer에 넣는다.
        
        return answer;
    }
}