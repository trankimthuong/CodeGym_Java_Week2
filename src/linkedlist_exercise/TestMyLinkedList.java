package linkedlist_exercise;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<String>();
        list.addFirst("China");
        list.printList();
        list.addFirst("VietNam");
        list.printList();
        list.addLast("Germany");
//      list.printListByPrev();
        list.printList();

//        list.remove(2);
//        list.printList();
//        list.remove(3);
//        list.printList();

//        boolean checkRemove = list.remove("canada");
//        list.printList();
//        System.out.println("check remove = " + checkRemove);
//
//        boolean checkRemove1 = list.remove("VietNam");
//        list.printList();
//        System.out.println("check remove = " + checkRemove1);

//        int size = list.size();
//        System.out.println("size = " + size);
//
//        boolean checkContains = list.contain("huuh");
//        System.out.println("Check contains 'huuh' = " + checkContains);
//
//        boolean checkContains1 = list.contain("China");
//        System.out.println("Check contains 'China' = " + checkContains1);
        int indexOf = list.indexOf("VietNam");
        System.out.println("index of 'VietNam' = " + indexOf);
        int indexOf1 = list.indexOf("Canada");
        System.out.println("index of 'Canada' = " + indexOf1);

        String firstElement = list.getFirst();
        String lastElement =  list.getLast();

        System.out.println("first element: " + firstElement
        + ", last element: " + lastElement);
    }
}
