package TwoPointers_SlidingWindow;

import java.util.Scanner;

/**
 * 최대 길이 연속 부분 수열
 * 14 2
 * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
 */
public class Solution6 {
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
        int answer = Integer.MIN_VALUE;
        int cnt=0, lt=0;
        for(int rt=0; rt<n; rt++){
            if(arr[rt]==0) cnt++;
            while(cnt > k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }
}
