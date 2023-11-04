import java.util.*;

//copyOfRange(arr, n1, n2) (원본 배열, 복사할 시작 인덱스, 복사할 끝 인덱스)
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<answer.length; i++) { //answer 길이만큼 반복
            int[] tmpArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            
            Arrays.sort(tmpArr); // 배열 오름차순 정렬
            answer[i] = tmpArr[commands[i][2]-1];
        }
        
        
        return answer;
    }
}