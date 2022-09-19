package String_문자열;

import java.util.Scanner;

/**
 * 7. 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열 => 회문 문자열
 * 문자열이 입력되었을 때 해당 문자열이 회문 문자열이면 "YES", 아니면 "NO" 출력
 * 대소문자 구분 x
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String answer = "YES";
//        str = str.toLowerCase();

        String tmp = new StringBuilder(str).reverse().toString(); // 뒤집기

        if(str.equalsIgnoreCase(tmp)) return "YES";
        else return "NO";
    }

    private static String solution2(String str) {
        String answer = "YES";
        int len = str.length();
        str = str.toLowerCase();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    private static String solution1(String str) {
        str = str.toLowerCase(); // 모두 소문자로 변경
//        System.out.println(str);
        char[] c = str.toCharArray();
        int lt = 0;
        int rt = c.length - 1;
        String ans = "";

        while(lt < rt){
            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++;
            rt--;
        }
        ans = String.valueOf(c);

        if(str.equals(ans)) return "YES";
        else return "NO";
    }
}
