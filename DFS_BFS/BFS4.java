package DFS_BFS;

import java.util.*;

/**
 * 그래프 최단거리(BFS)
 * 6 9
 * 1 3
 * 1 4
 * 2 1
 * 2 5
 * 3 4
 * 4 5
 * 4 6
 * 6 2
 * 6 5
 */
public class BFS4 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] dis, check;

    public static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int curV = queue.poll();
            for(int nv : graph.get(curV)){
                if(check[nv] == 0){
                    check[nv]=1;
                    queue.offer(nv);
                    dis[nv] = dis[curV]+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        dis = new int[n+1];
        check = new int[n+1];
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : " + dis[i]);
        }
    }
}
