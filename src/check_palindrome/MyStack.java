package check_palindrome;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyStack<T> {
    public LinkedList<T> stack;

    public MyStack(){
        stack = new LinkedList<>();
    }

    public void push(T element){
        stack.addFirst(element);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        if(stack.size() == 0)
            return true;
        return false;
    }

    public T pop(){
        if(stack.isEmpty())
            throw new EmptyStackException();
        return stack.removeFirst();
    }

}
