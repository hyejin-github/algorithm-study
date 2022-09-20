package String_문자열;

import java.util.Scanner;

/**
 * 11. 문자열 압축
 * 같은 문자가 연속으로 반복되는 경우, 반복되는 문자 바로 오른쪽에 반복 횟수 표기하는 방법으로 문자열 압축
 * 반복횟수가 1인 경우 생략
 */
public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();
        str += " "; // 마지막 문자까지 넣어줘야 하므로 문자열 뒤에 빈문자 추가로 넣어주기
        char[] s = str.toCharArray();


        int cnt = 1;
        for(int i=0; i<s.length-1; i++){
            if(s[i]==s[i+1]){
                cnt++;
            }else{
                sb.append(s[i]);
                if(cnt!=1){
                    sb.append(cnt);
                }
                cnt = 1;
            }
        }

        System.out.println(sb.toString());
    }
}
