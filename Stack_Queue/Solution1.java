package Stack_Queue;

import java.util.*;

/**
 * 괄호문제
 * Stack
 * (()(()))(()
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "YES";

        Stack<Character> st = new Stack<>();

        for(Character c : str.toCharArray()){
            if(c=='(') st.push(c);
            else{ // 닫는괄호만남
                if(st.isEmpty()) return "NO";
                // 비어있지 않으면
                st.pop(); // 하나 꺼냄
            }
        }

        if(!st.isEmpty()) return "NO";
        return answer;
    }
}
