package HashMap_TreeSet;

import java.util.*;

/**
 * 2. 아나그램 판별
 * AbaAeCe
 * baeeACA
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.print(solution(str1, str2));
    }

    public static String solution(String str1, String str2){
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1); // str1의 단어들 카운트
        }

        for(char x : str2.toCharArray()){ // str2 돌면서 map의 키값이 존재한다면 카운트-1
            // map에 x값이 존재하지 않거나 x에 대한 value 값이 0이라면 아나그램 아님, NO 리턴 후 종료
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            else{
                map.put(x, map.get(x)-1);
            }
        }

        for(char key : map.keySet()){
            if(map.get(key) != 0) return "NO";
        }
        return answer;
    }
}
