class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service = n/10; //서비스로 받은 음료수 개수
    
        if (service > 0) { //먹은 양꼬치 개수가 10개 이상
            k = k-service;
        }
        
        answer = n*12000 + k*2000; 
        
        return answer;
    }
}