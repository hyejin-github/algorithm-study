package HashMap_TreeSet;

import java.util.*;

/**
 * 3. 매출액의 종류(HashMap + SlidingWindows)
 * 7 4
 * 20 12 20 10 23 17 10
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        solution(n, k, arr);
    }

    public static void solution(int n, int k, int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        int lt = 0;
        for(int i=0; i<k-1; i++){ // k-1번째까지 값 미리 세팅
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        
        // k부터 투포인터 알고리즘 적용
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            ans.add(map.size()); // map의 크기 저장
            map.put(arr[lt], map.get(arr[lt])-1); // lt가 가리키는 매출액의 카운트 -1
            if(map.get(arr[lt])==0) map.remove(arr[lt]); // key값에 해당하는 value가 0이라면 없으니까 map.remove해준 뒤 lt++
            lt++;
        }

        for(int a : ans){
            System.out.print(a+" ");
        }
    }
}
