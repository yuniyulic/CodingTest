class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1의 행의 길이, arr1[0]의 열의 길이로 answer배열의 크기 선언
        // arr1과 arr2의 행과 열의 크기가 같으므로 arr1 사용해서 생성함..
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1.length; i++) { //arr1 길이만큼 두 번 반복
            for(int j=0; j<arr1[i].length; j++) { //arr1[i] 길이만큼 두 번 반복
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}