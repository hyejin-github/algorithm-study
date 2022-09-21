package Array_배열;

import java.util.Scanner;

/**
 * 4. 피보나치 수열
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x : solution(n)){
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int n){
        int[] ans = new int[n];

        ans[0] = 1;
        ans[1] = 1;
        for(int i=2; i<n; i++){
            ans[i] = ans[i-2] + ans[i-1];
        }
        return ans;
    }
}
