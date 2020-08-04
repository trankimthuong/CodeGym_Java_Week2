package kiem_tra_dau_ngoac;

public class MyStack<T> {
    private Object arr[];
    private int size;
    private int index = 0;
    public MyStack(int size){
        this.size = size;
        arr = new Object[size];
    }

    private void ensureCapa(){
        if(index >= size){

            Object[] newArr = new Object[size * 2 + 1];
            System.arraycopy(arr,0,newArr,0, size);
            arr = newArr;
            size = size * 2 + 1;
        }
    }

    public void push(T element){
        ensureCapa();
        if(isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    public T pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return (T) arr[--index];
    }

    public int size(){
        return index;
    }

    public boolean isEmpty(){
        if(index == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }
}
