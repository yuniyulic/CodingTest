class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tLen = t.length();
        int pLen = p.length();
        long pInt = Long.parseLong(p);

        for (int i = 0; i <= tLen - pLen; i++) {
            String cur = t.substring(i, pLen + i);
            if (pInt >= Long.parseLong(cur)) {
                answer++;
            }
        }
        return answer;
    }
}