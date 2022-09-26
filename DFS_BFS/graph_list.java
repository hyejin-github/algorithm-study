package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

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
 * n의 크기가 커지면 인접행렬은 비효율적 -> 인접리스트로 해결
 */
public class graph_list {
    static int[] check;
    static int n,m, answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    public static void DFS(int v){
        if(v==n) answer++;
        else{
            // v번 인접리스트 반복
            for(int nv : graph.get(v)){
                if(check[nv]==0){
                    check[nv]=1;
                    DFS(nv);
                    check[nv]=0; // 체크 헤제
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }
        check = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        check[1] = 1; // 방문 체크
        DFS(1);
        System.out.println(answer);
    }
}
