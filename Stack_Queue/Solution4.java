package Stack_Queue;

import java.util.*;

/**
 * 4. 후위식 연산(postfix)
 * 352+*9-
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public static int solution(String str){
        int ans = 0;

        Stack<Integer> st = new Stack<>();
        for(char c : str.toCharArray()){
            if(c!='+' && c!='-' && c!='*' && c!='/'){
                st.push(c-48);
            }else{
                int num1 = st.pop();
                int num2 = st.pop();
                int tmp = 0;
                switch (c){
                    case '+':
                        tmp = num2 + num1;
                        break;
                    case '-':
                        tmp = num2 - num1;
                        break;
                    case '*':
                        tmp = num2 * num1;
                        break;
                    case '/':
                        tmp = num2 / num1;
                        break;
                }
                st.push(tmp);
            }
        }
        ans = st.pop();

        return ans;
    }
}
