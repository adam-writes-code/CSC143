import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList <E> implements Iterable<E>{     //E for element; generic type

    private static final int DEFAULT_CAPACITY = 8;

    private E[] elementData;
    private int size;

    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        // Not Allowed
        // E object = new E();
        elementData = (E[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    public void add(E value) {
        ensureCapacity(elementData.length + 1);
        elementData[size] = value;
        size++;
    }

    public void add(int index, E value) {
        ensureCapacity(elementData.length + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i -1];
        }
        elementData[index] = value;
        size++;
    }

    public void clear() {
        for (int i =0; i< size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    /*Participation Activity
    public void remove(int index) {
        checkIndex(index, 0, size-1);
        if (elementData.length == 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size] = 0;
        size--;
    }
     */

    public void remove(int index) {
        checkIndex(index);
        if (elementData.length == 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size] = null;
        size--;
    }


    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E>{

        private int index;
        private boolean removeOk;

        public ArrayListIterator() {
            index = 0;
            removeOk = false;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next(){
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements present");
            }
            removeOk = true;
            return elementData[index++];

        }

        @Override
        public void remove() {
            if (!removeOk) {
                throw new IllegalStateException("Remove not allowed at this time");
            }
            ArrayList.this.remove(index-1);
            removeOk = false;
            index--;
        }
    }


    private void ensureCapacity(int capacity) {
        if (capacity > elementData.length) {
            int newCapacity = capacity * 2;
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }
    private void checkIndex (int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index must be 0 to size -1");
        }
    }
}
