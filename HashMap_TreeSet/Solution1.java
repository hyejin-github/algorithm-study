package HashMap_TreeSet;

import java.util.*;

/**
 * 1. 학급 회장(해쉬)
 * 15
 * BACBACCACCBDEDE
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(solution(n,str));
    }

    public static char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();

        for(char c : arr){
            map.put(c, map.getOrDefault(c,0)+1); // getOrDefualt (key에 해당되는 value 없으면 default = 0)
        }

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
//            System.out.println(key+ ", "+ map.get(key));
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static char solution1(int n, char[] arr){
        Map<String, Integer> map = new HashMap<>();

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        for(int i=0; i<n; i++){
            if(arr[i]=='A') map.put("A",++aCount);
            else if(arr[i]=='B') map.put("B", ++bCount);
            else if(arr[i]=='C') map.put("C", ++cCount);
            else if(arr[i]=='D') map.put("D", ++dCount);
            else map.put("E", ++eCount);
        }

        int[] total = new int[5];
        total[0] = map.get("A");
        total[1] = map.get("B");
        total[2] = map.get("C");
        total[3] = map.get("D");
        total[4] = map.get("E");

        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int i=0; i<5; i++){
            if(max < total[i]){
                max = total[i];
                idx = i;
            }
        }

        if(idx==0) return 'A';
        else if(idx==1) return 'B';
        else if(idx==2) return 'C';
        else if(idx==3) return 'D';
        else return 'E';
    }
}
