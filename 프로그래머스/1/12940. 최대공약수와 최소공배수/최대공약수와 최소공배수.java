class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int tmp;
        
        //n에 큰 수 넣기
        if(n < m) {
            tmp = n;
            n = m;
            m = tmp;
        }
        
        //최대공약수 구하기
        answer[0] = gcd(n, m);
        
        //최소공배수 구하기
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    //최대공약수 구하는 함수
    int gcd(int n, int m) {
        int r;
        while(m != 0) {
            r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
}