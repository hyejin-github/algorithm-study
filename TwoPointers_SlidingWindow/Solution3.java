package TwoPointers_SlidingWindow;

import java.util.Scanner;

/**
 * 최대 매출 합
 * 10 3
 * 12 15 11 20 25 10 20 19 13 15
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

        System.out.println(solution(n, k, arr));
    }

    public static int solution(int n, int k, int[] arr){
        int ans = 0;
        int sum = 0;

        // sum 초기화
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        ans = sum;
        
        // 슬라이딩 윈도우 적용
        for(int i=k; i<n; i++){
            // 앞의 수 더해주고 뒤의 수 빼주기
            sum += (arr[i] - arr[i-k]);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
