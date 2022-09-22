package Array_배열;

import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[][] arr){
        int ans = Integer.MIN_VALUE;

        int sum1; // 행의 합
        int sum2; // 열으ㅢ 합
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j]; // 행 고정, 열 이동
                sum2 += arr[j][i]; // 행 이동, 열 고정
                ans = Math.max(ans, sum1);
                ans = Math.max(ans, sum2);
            }
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2+=arr[i][n-i-1];
        }
        ans = Math.max(ans,sum1);
        ans = Math.max(ans,sum2);

        return ans;
    }
}
