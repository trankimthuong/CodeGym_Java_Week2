package arraylist_excercise;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public MyList(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }


    public E[] getElements() {
        return elements;
    }

    public MyList(int capacity){
        elements = (E[]) new Object[capacity];
    }

    public void add(int index, E element){
        ensureCapacity(DEFAULT_CAPACITY);
        for(int i = size -1; i >= index; i--){
            elements[i+1] = elements[i];
        }

        elements[index] = element;
        size++;
    }

    public E remove(int index){
        checkIndex(index);
        E e = (E)elements[index];
        for(int i = index; i < size -1; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public int size(){
        return this.size;
    }

    public E clone(){
        return (E)elements[0];
    }

    public boolean contains(E o){
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i]))
                return true;
        }
        return false;
    }

    public int indexOf(E o){
        for(int i = 0; i < size; i++){
            if(o.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public boolean add(E e){
        ensureCapacity(DEFAULT_CAPACITY);
        if(e == null)
            return false;
        for(int i = 0; i < size; i++){
            if(e.equals(elements[i])){
                throw new UnsupportedOperationException("Da chua phan tu nay!!!");
            }
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity){
        if(size >= minCapacity){
            E[] newElement = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(elements,0,newElement,0,size);
            elements = newElement;
        }
    }

    public E get(int i){
        checkIndex(i);
        return (E)elements[i];
    }

    public void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
    }

    public void clear(){
        elements = (E[])(new Object[DEFAULT_CAPACITY]);
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for(int i = 0; i < size; i++){
            result.append(elements[i]);
            if(i < size - 1) result.append(", ");
        }
        return result.toString() +"]";
    }
}
