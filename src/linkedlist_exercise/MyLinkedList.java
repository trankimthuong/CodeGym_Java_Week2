package linkedlist_exercise;

public class MyLinkedList<E> {
    class Node<E>{
        Node next;
        Node previous;
        E data;
        public Node(){
        }

        public Node(E data){
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    private Node head = null;
    private Node tail = null;
    private int numNodes = 0;

    public MyLinkedList(){
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    public void add(int index, E element){
        if(index == 0) addFirst(element);
        else if(index >= numNodes) addLast(element);
        else{
            Node current = head;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            current.next.previous = current;
            current.next.next = temp;
            temp.previous = current.next;
            numNodes++;
        }
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        if(this.numNodes == 0){
            tail = head = newNode;
        }else{
            newNode.next = head;
            newNode.previous = null;
            head.previous = newNode;
            head = newNode;
            if(tail == null)
                tail = head;
        }
        numNodes++;
    }

    public void addLast(E e){
        Node newNode = new Node<E>(e);

        if(tail == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
            newNode.next = null;
            tail = newNode;
        }
        numNodes++;
    }

    public E removeFirst(){
        if(this.numNodes == 0) return null;
        else{
            Node<E> temp = this.head;
            head.next.previous = null;
            head = head.next;
            this.numNodes--;
            return temp.getData();
        }
    }

    public E removeLast(){
        if(this.numNodes == 0) return null;
        else if(this.numNodes == 1){
            Node<E> temp = head;
            head = tail = null;
            this.numNodes = 0;
            return temp.getData();
        }else{
            Node<E> temp = tail;
            tail = tail.previous;
            tail.next = null;
            this.numNodes--;
            return temp.getData();
        }
    }

    public E remove(int index){
        if(index < 0 || index >= this.numNodes) return null;
        else if(index == 0) return removeFirst();
        else if(index == this.numNodes - 1) return removeLast();
        else{
            Node<E> current = head;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            temp.next.previous = current;
            this.numNodes--;
            return temp.getData();
        }
    }

    public boolean remove(E e){
        Node<E> current = head;
        for(int i = 0; i < this.getNumNodes(); i++){
            if(current.getData().equals(e)){
                remove(i);
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size(){
        return this.getNumNodes();
    }

    public MyLinkedList clone(){
        MyLinkedList<E> newList = new MyLinkedList<>();
        newList.head = this.head;
        newList.tail = this.tail;
        newList.numNodes = this.numNodes;
        return newList;
    }

    public boolean contain(E o){
        Node temp = this.head;
        for(int i = 0; i < this.numNodes; i++){
            if(temp.data.equals(o)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o){
        Node temp = this.head;
        int check = -1;
        for(int i = 0; i < this.numNodes; i++){
            if(temp.data.equals(o)){
                check = i;
                break;
            }
            temp = temp.next;
        }
        return check;
    }

    public boolean add(E o){
        return true;
    }

    public E get(int index){
        Node<E> current = this.head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.getData();
    }

    public E getFirst(){
        Node<E> current = this.head;
        return current.data;
    }

    public E getLast(){
        Node<E> current = this.tail;
        return current.getData();
    }

    public void clear(){
        if(this.numNodes > 0){
            this.head = new Node();
            this.numNodes = 0;
            this.tail = new Node();
        }
    }

    public void printList(){
        System.out.println();
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printListByPrev(){
        System.out.println();
        Node temp = tail;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.previous;
        }
    }
}
