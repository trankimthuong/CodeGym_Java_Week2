package search_bst;

public class MyTree {
    class Node{
        int key;
        MyTree.Node left, right;
        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    Node root;
    public MyTree(){
        root = null;
    }

    public void insert(int key){
        root = insertRec(root,key);
    }

    public Node insertRec(Node root, int key){
        if(root == null){
            root = new MyTree.Node(key);
            return root;
        }

        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void preorderRec(Node root){
        if(root != null){
            System.out.println(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public void preorder(){
        preorderRec(root);
    }

    public Node searchRec(Node root, int key){
        if(root == null || root.key == key)
            return root;
        if(key < root.key)
            return searchRec(root.left,key);
        return searchRec(root.right,key);
    }
    public boolean search(int key){
        try {
            if(searchRec(root,key).key == key)
                return true;
        }
        catch (Exception e) {
            return false;
        }
        return false;
    }
}

