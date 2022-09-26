package DFS_BFS;

public class DFS {
    static class Node{
        int data;
        Node lt, rt; // Node의 객체 주소 저장
        public Node(int val){
            data = val;
            lt=rt=null;
        }
    }

    static Node root;
    public static void main(String[] args) {
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }

    public static void DFS(Node root){
        if(root==null) return;
        else{
//            System.out.print(root.data+" "); // 전위순회
            DFS(root.lt);
//            System.out.print(root.data + " "); // 중위순회
            DFS(root.rt);
        }
    }
}
