package implement_stack_use_array;

public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;

    public MyStack(int size){
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty(){
        if(index == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }

    public int size(){
        return index;
    }

    public void push(int element){
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
}
