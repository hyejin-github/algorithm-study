package String_문자열;

import java.util.Scanner;

/**
 * 10. 가장 짧은 문자거리
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램 작성
 */
public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);

        // 1. 문자 배열로 바꾸기
        char[] s = str.toCharArray();
        int[] ans = new int[s.length];
        int p = 1000; // 처음 비교할 대상 없으므로 최대값으로 초기화
        // 2. 순방향 탐색하며 거리 구하기
        for(int i=0; i<s.length; i++){
            if(s[i] == target){ // 타겟과 일치하면 그 자리 숫자는 0
                p = 0;
                ans[i] = p;
            }else{
                p++;
                ans[i] = p;
            }
        }

        p = 1000; // 다시 한 번 초기화
        // 3. 역방향 탐색하며 더 작은 값으로 갱신
        for(int i=s.length-1; i>=0; i--){
            if(s[i] == target){
                p = 0;
            }else{
                p++;
                ans[i] = Math.min(ans[i],p);
            }
        }

        for(int a : ans){
            System.out.print(a+ " ");
        }
    }
}
