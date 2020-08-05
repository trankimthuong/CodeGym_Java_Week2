package delete_bst;

public class TestDelete {
    public static void main(String[] args) {
        MyTree tree = new MyTree();

       /* Let us create following BST
             50
          /     \
         30      70
        /  \    /  \
       20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("duyet cay theo phuong phap preorder");
        tree.preorder();

        tree.deleteKey(50);
        System.out.println("duyet cay theo phuong phap preorder");
        tree.preorder();

    }
}
