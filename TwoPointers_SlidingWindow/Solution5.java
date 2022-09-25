package TwoPointers_SlidingWindow;

import java.util.Scanner;

/**
 * 5. 연속된 자연수의 합
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n/2+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[] arr){
        int cnt = 0;
        int lt = 0, sum = 0;

        for(int rt=0; rt<arr.length; rt++){
            sum += arr[rt];
            if(sum==n) cnt++;

            while(sum>=n){
                sum -= arr[lt++];
                if(sum==n) cnt++;
            }
        }
        return cnt;
    }
}
