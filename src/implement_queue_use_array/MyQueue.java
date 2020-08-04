package implement_queue_use_array;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        if(this.currentSize == this.capacity){
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if(this.currentSize == 0){
            return true;
        }
        return false;
    }

    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow!!! unable to add element: " + item);
        }else{
            tail++;
            if(tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element: " + item + " is pushed to Queue!!!");
        }
    }

    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Underflow!!! unable to remove element from queue");
        }else{
            head++;
            if(head == capacity - 1){
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
