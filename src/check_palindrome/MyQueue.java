package check_palindrome;

public class MyQueue<T> {
    public Node head;
    public Node tail;

    public MyQueue(){
        this.head = null;
        this.tail = null;
    }
    public void enqueue(T key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        if(this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null)
            this.tail = null;
        return temp;
    }
}
