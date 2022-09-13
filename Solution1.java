import java.util.*;

/***
 * 문제 : 문자 찾기
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램 작성
 * 대소문자 구분x
 * 문자열의 길이 <= 100
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 문자열 입력받기
        char c = sc.next().charAt(0); // 특정 문자 입력받기
        System.out.println(solution(str, c));
    }

    private static int solution(String str, char t) {
        int ans = 0; // 해당 문자 몇 개 존재하는지 갯수
        str = str.toLowerCase(); // 모두 소문자로 변환
        t = Character.toLowerCase(t); // 특정 문자도 소문자로 변환
        for(char c : str.toCharArray()){
            if(c==t) ans++; // 특정 문자와 일치하면 ans+1
        }
        return ans;
    }
}
