import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zero_count = 0;
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                }
            }
            if(lottos[i] == 0){
                zero_count++;
            }
        }
        int result = 0;
        switch(count){
            case 6:
                result = 1;
                break;
            case 5:
                result = 2;
                break;
            case 4:
                result = 3;
                break;
            case 3:
                result = 4;
                break;
            case 2:
                result = 5;
                break;
            default:
                result = 6;
        }
        int number = result - zero_count;
        if(number == 0){
            number = 1;
        }
        int[] answer = {number, result};
        

        
        return answer;
    }
}