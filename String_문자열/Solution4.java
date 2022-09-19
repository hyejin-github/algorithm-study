package String_문자열;

import java.util.*;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력
 * N(3<=N<=20)
 */
public class Solution4 {
    public static ArrayList<String> solution(int n, String[] ans){
        ArrayList<String> answer = new ArrayList<>();

        // 1. StringBuilder를 사용해서 문자열 한 번에 뒤집기
//        for(String x : ans){
//            String tmp = new StringBuilder(x).reverse().toString(); // 뒤집음
//            answer.add(tmp);
//        }

        // 2.
        for(String x : ans){
            char[] c = x.toCharArray(); // 문자열 String을 문자형 배열 char[]로 변환
            int lt = 0;
            int rt = c.length - 1;
            while(lt<rt){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ans = new String[N];
        for(int i=0; i<N; i++){
            ans[i] = sc.next();
        }
        for(String x : solution(N, ans)){
            System.out.println(x);
        }
    }
    public static void main1(String[] args) {
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
