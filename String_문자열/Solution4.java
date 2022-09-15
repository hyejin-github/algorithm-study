package String_문자열;

import java.util.*;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력
 * N(3<=N<=20)
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] answer = new String[N];
        for(int i=0; i<N; i++){
            String str = sc.next();
            String ans = "";
            char[] c = str.toCharArray();

            for(int j=c.length-1; j>=0; j--){
                ans += c[j];
            }
            answer[i] = ans;
        }

        for(String s : answer){
            System.out.println(s);
        }
    }
}
