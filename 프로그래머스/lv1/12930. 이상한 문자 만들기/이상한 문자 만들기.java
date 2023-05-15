	class Solution {
  public String solution(String s) {
    String answer = "";
    int idx = 0;
    
    String[] strArr = s.split("");
 
    for(int i=0; i<strArr.length; i++) {
      if((" ").equals(strArr[i])) idx = 0;
      else {  
        if(idx%2==0) {
          idx++;
          strArr[i] = strArr[i].toUpperCase(); 
        }else {
          idx++;
          strArr[i] = strArr[i].toLowerCase();
        }
      }
      answer += strArr[i];
    }
 
    return answer;
 
  }
}