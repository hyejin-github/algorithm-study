package HashMap_TreeSet;

import java.util.*;

/**
 * 5. K번째 수(TreeSet)
 * 10 3
 * 13 15 34 23 45 65 33 11 26 42
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }

    public static int solution(int n, int k, int[] arr){
        int answer = -1;

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder()); // 내림차순 정렬(기본 오름차순)

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int l=j+1; l<n; l++){
                    set.add(arr[i]+arr[j]+arr[l]); // 중복 제거
                }
            }
        }

        int cnt = 0;
        for(int x : set){
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }
}
