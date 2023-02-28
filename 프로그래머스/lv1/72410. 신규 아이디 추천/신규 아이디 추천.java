import java.util.Arrays;

class Solution {
    public String solution(String new_id) {

        String str = new_id.toLowerCase();//1.대문자를 소문자로변경
        str = str.replaceAll("[^-._0-9a-zA-Z]", "");//2특수문자제거
        str = str.replaceAll("\\.+", ".");//3.연속된...제거

        String[] str2 = new String[str.length()];
        for (int i = 0; i < str2.length; i++) { //배열로변경
            str2[i] = String.valueOf(str.charAt(i));
        }

        if (str2[0].equals(".")) {//처음이나 끝에 . 제거
            str2[0] = "";
        }
        if (str2[str2.length - 1].equals(".")) {
            str2[str2.length - 1] = "";
        }


        String str3 = "";

        if (str2.length == 1) {  //빈문자열이면 a대입
            String abc = str2[0];

            if (abc.equals("")) {
                str2[0] = "a";
            }
        }
        for (int i = 0; i < str2.length; i++) { //다시문자열로변경
            str3 += str2[i];
        }

        String answer = str3.replaceAll("\\s", "");//공백제거


        if (answer.length() >= 15) {
            answer = answer.substring(0, 15);//15자리까지자르기
            String abc = String.valueOf(answer.charAt(14));
            if (abc.equals(".")) {
                answer = answer.substring(0, 14);
            }
        } else if (answer.length() <= 2) {
            for (int i = 0; i < 2; i++) {
                answer += (answer.length() == 1) ? answer.charAt(0) : answer.charAt(1);
                if (answer.length() == 3) {
                    break;
                }
            }
        }
        
        
        return answer;
    }
}