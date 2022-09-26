package DFS_BFS;

import java.util.*;

/**
 * Tree 말단노드까지의 가장 짧은 경로(DFS)
 * DFS탐색 하려면 완전이진트리여야함
 */
public class BFS2 {
    static class Node{
        int data;
        Node lt, rt; // 주소 저장
        Node(int data){
            this.data = data;
            lt=rt=null;
        }
    }

    static Node root;
    public static int BFS(Node root){
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);
        int level = 0; // 레벨탐색
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                Node cur = queue.poll();
                // 말단노드라면
                if(cur.lt == null && cur.rt == null) return level;
                if(cur.lt != null) queue.offer(cur.lt);
                if(cur.rt != null) queue.offer(cur.rt);
            }
            level++;
        }
        return 0;
    }

    public static void main(String args[]){
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
