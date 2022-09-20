package String_문자열;

import java.util.Scanner;

/**
 * 8. 유효한 팰린드롬
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열 => 팰린드롬
 * 해당 문자열이 팰린드롬이면 YES, 아니면 NO 출력
 * 회문을 검사할 때 알파벳만을 가지고 회문 검사, 대소문자 구분x
 * 알파벳 이외의 문자들은 무시
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        str=str.toLowerCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equals(tmp)) return "YES";
        else return "NO";
    }
}
