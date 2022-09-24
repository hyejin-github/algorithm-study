package TwoPointers_SlidingWindow;

import java.util.*;
/**
 * 4. 연속 부분수열 (투포인터 알고리즘)
 * 8 6
 * 1 2 1 3 1 1 1 2
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }

    public static int solution(int n, int m, int[] arr){
        int ans = 0;
        int lt=0;
        int sum=0;

        for(int rt=0; rt<n; rt++){
            sum += arr[rt];
            if(sum==m) ans++; // sum이 m과 같은지 확인

            while(sum>=m){
                sum -= arr[lt++]; // lt가 가리키는 곳 빼고 나서 lt++
                if(sum==m) ans++;
            }
        }
        return ans;
    }
}
