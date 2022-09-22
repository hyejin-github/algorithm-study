package Array_배열;

import java.util.Scanner;

/**
 * 멘토링
 * 4중 for문
 */
public class Solution12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m+1][n+1];

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n,m,arr));
    }

    public static int solution(int n, int m, int[][] arr){
        int ans =0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){

                int cnt=0; // (i,j)쌍이 멘토-멘티가 될 수 있는지
                for(int k=1; k<=m; k++){ // m번째 시험의 횟수만큼 반복
                    int pi=0, pj=0;
                    for(int s=1; s<=n; s++){ // n등까지 비교
                        if(arr[k][s] == i) pi=s; // i번째 학생의 등수
                        if(arr[k][s] == j) pj=s; // j번째 학생의 등수
                    }
                    if(pi<pj) cnt++; // 멘토-멘티 할 수 있다면 cnt++;
                }
                if(cnt==m) ans++; // 모든 k의 경우 일치하다면 ans++;
            }
        }
        return ans;
    }
}
