package String_문자열;

import java.util.*;

/***
 * 2. 대소문자 변환
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아
 * 대문자는 소문자로, 소문자는 대문자로 변환하여 출력
 */

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 입력받기

        System.out.println(solution(str));
    }

    public static String solution(String str){
        String ans = ""; // 초기화
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)) // 소문자라면
                ans += Character.toUpperCase(c); // 대문자로
            else ans += Character.toLowerCase(c); // 소문자로
        }
        return ans;
    }
}
