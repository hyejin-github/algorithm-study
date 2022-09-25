package Stack_Queue;

import java.util.*;

/**
 * 2. 괄호제거
 * (A(BC)D)EF(G(H)(IJ)K)LM(N)
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public static String solution(String str){
        String answer = "";

        Stack<Character> st = new Stack<>();
        for(Character c : str.toCharArray()){
            if(c==')'){ // 닫는괄호 만나면 여는괄호 만날 때까지 pop
                while(st.pop()!='(');
            }else st.push(c);
        }

        for(int i=0; i<st.size(); i++){
            answer += st.get(i);
        }
//        answer = new StringBuilder(answer).reverse().toString();
        return answer;
    }
}
