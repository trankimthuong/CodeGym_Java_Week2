package java_arraylist;

public class MyArrayList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public MyArrayList(){
    }

    public MyArrayList(E[] object){
        for(int i = 0; i < object.length; i++){
            add(object[i]);
        }
    }

    public void add(E e){
        add(size, e);
    }

    public void add(int index, E e){
        ensureCapacity();
        for(int i = size - 1; i >= index; i--)
            data[i+1] = data[i];
        data[index] = e;
        size++;
    }

    private void ensureCapacity(){
        if(size >= data.length){
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data,0,newData,0,size);
            data = newData;
        }
    }

    public boolean contains(E e){
        for(int i = 0; i < size; i++){
            if(e.equals(data[i]))
                return true;
        }
        return false;
    }

    public E get(int index){
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index "+ index + " out of bounds");
        }
    }

    public int indexOf(E e){
        for(int i = 0; i < data.length; i++){
            if(e.equals(data[i])) return i;
        }
        return -1;
    }

    public int lastIndexOf(E e){
        for(int i = data.length -1; i >= 0; i--){
            if(e.equals(data[i])) return i;
        }
        return -1;
    }

    public E remove(int index){
        E e = data[index];
        for(int i = index; i < data.length -1; i++){
            data[i] = data[i+1];
        }
        data[data.length - 1] = null;
        size--;
        return e;
    }

    public void remove(E e){
        for(int i = 0; i < data.length; i++){
            if(e.equals(data[i])){
                remove(i);
                i--;
            }
        }
    }

    public int size(){
        return this.size;
    }

    public E set(int index, E e){
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) result.append(", ");
        }

        return result.toString() + "]";
    }
}
