package Array_배열;

import java.util.Scanner;

/**
 * 7. 점수계산
 */
public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }

    public static int solution(int n, int[] arr){
        int ans=0;
        int cnt=0;

        for(int i=0; i<n; i++){
            if(arr[i]==1){
                cnt++;
                ans+=cnt;
            }else{
                cnt=0;
            }
        }
        return ans;
    }
}
