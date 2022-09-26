package DFS_BFS;

/**
 * Tree 말단노드까지의 가장 짧은 경로(DFS)
 * DFS탐색 하려면 완전이진트리여야함
 */
public class DFS3 {
    static class Node{
        int data;
        Node lt, rt; // 주소 저장
        Node(int data){
            this.data = data;
            lt=rt=null;
        }
    }

    static Node root;
    public static int DFS(int level, Node root){
        // 말단노드이면 리턴
        if(root.lt==null && root.rt==null) return level;
        else{
            return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
        }
    }

    public static void main(String args[]){
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(DFS(0,root));
    }
}
