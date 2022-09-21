package Array_배열;

import java.util.Scanner;

/**
 * 2. 보이는 학새
 * 학생을 일렬로 세웠을 때, 볼 수 있는 학생의 수
 */
public class Solution2 {
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
        int ans = 1;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max) {
                ans++;
                max = arr[i];
            }
        }
        return ans;
    }
}
