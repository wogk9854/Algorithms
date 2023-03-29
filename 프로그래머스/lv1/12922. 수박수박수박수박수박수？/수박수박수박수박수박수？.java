class Solution {
    public String solution(int n) {
        String answer = "";
        String str1 = "수";
        String str2 = "박";
        String a = str1 + str2;
        String b = str2 + str1;
        
        if(n % 2 == 0){
            answer = a.repeat(n / 2);
        } else {
            if(n == 1){
                answer = str1;
            } else {
                answer = str1 + b.repeat(n / 2);
            }
        }

        return answer;
    }
}