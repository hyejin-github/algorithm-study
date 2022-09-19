package String_문자열;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();

        System.out.println(solution(str));
    }

    public static String solution(String str){
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = s.length - 1;
        String ans = "";

        while(lt < rt){
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        ans = String.valueOf(s);
        return ans;
    }
}
