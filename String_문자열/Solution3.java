package String_문자열;

import java.util.*;

/***
 * 3. 문장 속 단어
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 작성
 * 문장속의 각 단어는 공백으로 구분
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 한 줄 입력

        System.out.println(solution(str));
    }

    public static String solution(String str){
        String ans = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" "); // 공백 기준으로 쪼개기
        for(String x : s){
            int len = x.length();
            if(m < len){
                m = len;
                ans = x;
            }
        }
        return ans;
    }
}
