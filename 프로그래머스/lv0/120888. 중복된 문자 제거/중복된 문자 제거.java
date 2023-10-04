class Solution {
    public String solution(String my_string) {
        // StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        
        // my_string 한글자씩 문자 배열에 넣음
        // 각 문자별 for문 반복
        for (char ch : my_string.toCharArray()) {
            if (sb.indexOf(String.valueOf(ch)) == -1) { // 문자가 StringBuilder에 없으면
                sb.append(ch); // append해서 그 문자를 넣어줌 (이미 있으면 안 넣고 넘어감)
            }
        }
        
        return sb.toString(); // String으로 바꿔준다
    }
}