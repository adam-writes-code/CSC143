import java.util.Arrays;

public class ArrayList <E>{     //E for element; generic type

    private static final int DEFAULT_CAPACITY = 8;

    private E[] elementData;
    private int size;

    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
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
