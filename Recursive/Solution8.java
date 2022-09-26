package Recursive;

import java.util.*;

/**
 * 8. 송아지 찾기(BFS-최단거리, 레벨탐색)
 * 5 14
 * 앞으로 1, 뒤로 1, 앞으로 5
 * 체크 배열 만들어서 이미 방문한 곳은 다시 방문 x
 */
public class Solution8 {
    static int ans=0;
    static int[] distance={-1,1,5};
    static int[] ch;
    static Queue<Integer> queue = new LinkedList<>();

    public static int solution(int n, int m){
        ch = new int[10001]; // 방문 여부 체크 배열
        ch[n] = 1; // 출발지점
        queue.offer(n);
        int level = 0;
        while(!queue.isEmpty()){
            // 레벨 탐색
            int len = queue.size();
            for(int i=0; i<len; i++){
                int x = queue.poll();;
                for(int j=0; j<3; j++){
                    int nx = x + distance[j]; // 이동할 수 있는 모든 경우의 수
                    if(nx == m) return (level+1);
                    // 범위 안에 있고 아직 방문하지 않았다면
                    if(nx>=1 && nx<=10000 && ch[nx]==0){
                        ch[nx] = 1; // 방문 여부 체크
                        queue.offer(nx); // 큐에 넣기
                    }
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 현수 위치
        int m = sc.nextInt(); // 송아지 위치

        System.out.println(solution(n,m));
    }
}
