package Array_배열;

import java.util.Scanner;

public class Solution10 {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(solution(n, arr));
    }

    public static int solution(int n, int[][] arr){
        int cnt =0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int d=0; d<4; d++){
                    int nx = i+dx[d];
                    int ny = j+dy[d];

                    if(nx>=0 && ny>=0 && ny<n && nx<n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) cnt++;
            }
        }
        return cnt;
    }
}
