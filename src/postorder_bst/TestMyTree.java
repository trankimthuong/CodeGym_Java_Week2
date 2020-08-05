package postorder_bst;

public class TestMyTree {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.insert(60);
        tree.insert(55);
        tree.insert(45);
        tree.insert(57);
        tree.insert(59);
        tree.insert(100);
        tree.insert(67);
        tree.insert(107);
        tree.insert(101);
        System.out.println("duyet cay theo phuong phap postorder");
        tree.postorderBST();
    }
}
