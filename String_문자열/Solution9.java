package String_문자열;

import java.util.Scanner;

/**
 * 9. 숫자만 출력
 * 문자와 숫자가 섞여있는 문자열 ㅈㅇ 숫자만 추출하여 그 순서대로 자연수로 만들기
 */
public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public static int solution(String str){
        int answer = 0;

        str = str.replaceAll("[^0-9]","");

        return Integer.valueOf(str);
    }
}
