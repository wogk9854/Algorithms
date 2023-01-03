class Solution {
    public int solution(int hp) {
        int answer = hp / 5;

        answer += ((hp % 5) >= 3) ? ((hp % 5) / 3) + ((hp % 5) % 3) : (hp % 5);
        return answer;
    }
}