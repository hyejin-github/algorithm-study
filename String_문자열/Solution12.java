package String_문자열;

import java.util.Scanner;

/**
 * 12. 암호
 * # : 1, * : 0
 * 2진수 형태를 10진수로 바꾸고, 그에 대한 문자 출력
 */
public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n, str));
    }

    public static String solution(int n, String s){
        String answer = "";


        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7); // 0부터 7번째까지 자른 문자열 tmp에 저장
            tmp = tmp.replace('#','1'); // #을 1로
            tmp = tmp.replace('*','0'); // *을 0으로

            int num = Integer.parseInt(tmp, 2); // String을 10진수로 변환
//           System.out.println(tmp + " " + num);

           answer += (char) num;
            s = s.substring(7); // 7번째부터 끝까지 자런 문자열 s에 저장
        }
        return answer;
    }
}
