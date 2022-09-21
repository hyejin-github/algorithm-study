package Array_배열;

import java.util.Scanner;

/**
 * 5. 소수(에라토스테네스 체)
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    public static int solution(int n){
        int cnt = 0;

        // 에라토스테네스 체 배열 생성
        int[] ch = new int[n+1];
        for(int i=2; i<n; i++){
            if(ch[i]==0){
                cnt++;
                for(int j=i; j<n; j+=i) ch[j] = 1; // i의 배수 체크하니까 j += i
            }
        }

        return cnt;
    }
}
