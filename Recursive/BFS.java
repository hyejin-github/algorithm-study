package Recursive;

import java.util.*;

public class BFS {
    static class Node{
        int data;
        Node lt, rt; // Node 객체의 주소 저장
        public Node(int data){
            this.data = data;
            lt=rt=null;
        }
    }

    static Node root;
    public static void main(String[] args){
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        BFS(root); // 루트노드의 주소
    }

    public static void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0; // 루트노드의 레벨은 0
        while(!queue.isEmpty()){
            int len = queue.size();
            System.out.print(level + " : " );
            for(int i=0; i<len; i++){
                Node cur = queue.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) queue.offer(cur.lt);
                if(cur.rt!=null) queue.offer(cur.rt);
            }
            level++;
            System.out.println();
        }
    }
}
