import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[1];
        int min = Arrays.stream(arr).min().getAsInt();
         if(arr.length == 1){
            answer[0] = -1;
        } else{
            answer = new int[arr.length-1];
            for(int i = 0,j = 0; i < arr.length; i++){
                if(arr[i] != min){
                    answer[j] = arr[i];
                    j++;
                }
            }
        }
        
        return answer;
    }
}