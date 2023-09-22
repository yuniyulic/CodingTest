class Solution {
    public int solution(String my_string) {
        //my_string에서 숫자만 추출해서 배열 myStrArr에 넣는다.
        String[] myStrArr = my_string.replaceAll("[^0-9]", "").split("");
        int answer = 0;
        
        //배열 myStrArr의 원소들을 answer에 차례대로 더해준다.
        for (int i=0; i<myStrArr.length; i++) {
            answer += Integer.parseInt(myStrArr[i]); //String을 int로 형변환
        }
        
        return answer;
    }
} 