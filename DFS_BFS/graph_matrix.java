package DFS_BFS;

import java.util.*;

/**
 * 5 9
 * 1 2
 * 1 3
 * 1 4
 * 2 1
 * 2 3
 * 2 5
 * 3 4
 * 4 2
 * 4 5
 * 경로 -> 한 번 방문한 노드는 다시 방문 x
 */
public class graph_matrix {
    static int[] check;
    static int n,m, answer=0;
    static int[][] arr;
    public static void DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<n; i++){
                if(arr[v][i]==1 && check[i]==0){
                    check[i] = 1;
                    DFS(i);
                    // back하는 시점 - 체크 풀어줘야함
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        check = new int[n+1];
        arr = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }
        check[1] = 1; // 방문 체크
        DFS(1);
        System.out.println(answer);
    }
}
