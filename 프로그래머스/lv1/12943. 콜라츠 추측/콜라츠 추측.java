class Solution {
    public int solution(int num) {
        long number = num;
        int answer = 0;
        long num2 = 0;
        if(number == 1){
            num2 = 0;
        }else{
            for(int i = 0; i < 500; i++){
                if(i == 0){
                    if(number % 2 == 0){
                        num2 = number / 2;
                    }else{
                        num2 = number * 3 + 1;
                    }
                }else{
                    if(num2 % 2 == 0){
                        num2 = num2 / 2;
                    }else{
                        num2 = num2 * 3 + 1;
                    }
                }
                answer++;
                if(num2 == 1){
                    break;
                }

            }
        }
        if(num2 == 0){
            answer = 0;
        } else if(num2 != 1){
            answer = -1;
        }
        
        
        return answer;
    }
}