package postorder_bst;

public class MyTree {
    class Node{
        int key;
        Node left, right;
        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    Node root;
    public MyTree(){
        root = null;
    }

    public Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }
        else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void insert(int key){
        root = insertRec(root, key);
    }

    void postorderBST(Node root){
        if(root != null){
            postorderBST(root.left);
            postorderBST(root.right);
            System.out.println(root.key + "");
        }
    }

    void postorderBST(){
        postorderBST(root);
    }
}
