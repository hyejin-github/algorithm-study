package Stack_Queue;

import java.util.*;

/**
 * 7. 교육과정설계(Queue)
 * CBA
 * CBDAGE
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2){
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for(char c : str1.toCharArray()) queue.offer(c);

        for(char c : str2.toCharArray()){
            if(queue.contains(c)){ // 필수과목
                if(c != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return answer;
    }
}
