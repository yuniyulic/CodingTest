class Solution {
    public int solution(int price) {
        double answer = 0; // 지불해야 할 금액

        if (price >= 500000) {
            answer = price - (price * 0.2); // 50만원 이상 구매 시 20% 할인
        } else if (price >= 300000) {
            answer = price - (price * 0.1); // 30만원 이상 구매 시 10% 할인
        } else if (price >= 100000) {
            answer = price - (price * 0.05); // 10만원 이상 구매 시 5% 할인
        } else {
            answer = price; // 10만원 미만 구매 시 정가
        }

        return (int)answer; // 소수점 이하 버리기
        }
}
