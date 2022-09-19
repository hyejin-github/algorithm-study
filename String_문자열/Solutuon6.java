package String_문자열;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *6. 중복 문자 제거
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램 작성
 */
public class Solutuon6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String ans = "";

        for(int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)))
            if(str.indexOf(str.charAt(i)) == i){ // 처음 나오는 문자이므로 ans에 추가
                ans += str.charAt(i);
            }
        }
        return ans;
    }
}
