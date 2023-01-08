import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        int height = 0;
        int width = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] >= height){
                height = sizes[i][0];
            }
            if(sizes[i][1] >= width){
                width = sizes[i][1];
            }
        }
        int answer = height * width;
        
        return answer;
    }
}