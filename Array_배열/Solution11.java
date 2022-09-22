package Array_배열;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6]; // 학년은 고정

        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[][] arr){
        int ans = 0;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){

                for(int k=1; k<=5; k++){
                    // 학년당 반이 같으면 cnt++
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }

            }
            if(cnt > max){
                max = cnt;
                ans = i;
            }
        }
        return ans;
    }
}
