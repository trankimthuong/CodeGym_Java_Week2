package simple_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList l1 = new MyLinkedList(10);
        l1.addFirst(11);
        l1.addFirst(12);
        l1.addFirst(13);

        l1.add(4,9);
        l1.add(4,10);
        l1.printList();
        System.out.println("element at position 3: " + l1.get(3).getData());
    }
}
