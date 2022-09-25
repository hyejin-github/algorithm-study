package HashMap_TreeSet;

import java.util.*;

/**
 * 4. 모든 아나그램 찾기(해쉬, 투포인터, 슬라이딩 윈도우)
 * bacaAacba
 * abc
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));
    }

    public static int solution(String str1, String str2){
        int answer = 0;

        HashMap<Character, Integer> bMap = new HashMap<>();
        HashMap<Character, Integer> aMap = new HashMap<>();
        for(char c : str2.toCharArray()){
            bMap.put(c, bMap.getOrDefault(c,0)+1);
        }

        for(int i=0; i<str2.length()-1; i++){
            aMap.put(str1.charAt(i), aMap.getOrDefault(str1.charAt(i),0)+1);
        }

        int lt=0;
        for(int rt=str2.length()-1; rt<str1.length(); rt++){
            aMap.put(str1.charAt(rt), aMap.getOrDefault(str1.charAt(rt),0)+1);
            if(aMap.equals(bMap)) answer++;
            aMap.put(str1.charAt(lt), aMap.get(str1.charAt(lt))-1);
            if(aMap.get(str1.charAt(lt))==0) aMap.remove(str1.charAt(lt));
            lt++;
        }
        return answer;
    }
}
