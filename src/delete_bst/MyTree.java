package delete_bst;

public class MyTree {
    class Node{
        int key;
        Node left, right;
        public Node(int key){
            this.key = key;
            this.left = this.right = null;
        }
    }

    Node root;
    public MyTree(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root, key);
    }

    public Node insertRec(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }else if(root.key > key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    int minValue(Node root){
        int minv = root.key;
        while (root.left != null){
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    Node deleteRec(Node root, int key){
        if(root == null){
            return root;
        }
        if(key < root.key){
            root.left = deleteRec(root.left, key);
        }else if(key > root.key){
            root.right = deleteRec(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    void deleteKey(int key){
        root = deleteRec(root, key);
    }

    public void preorderRec(MyTree.Node root){
        if(root != null){
            System.out.println(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void preorder(){
        preorderRec(root);
    }
}
