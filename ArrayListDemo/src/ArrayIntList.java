import java.util.Arrays;

public class ArrayIntList {

    private static final int DEFAULT_CAPACITY = 8;

    private int[] elementData;
    private int size;

    public ArrayIntList(){
        this(DEFAULT_CAPACITY);
    }

    public ArrayIntList(int capacity) {
        elementData = new int[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }

    public void add(int value) {
        ensureCapacity(elementData.length + 1);
        elementData[size] = value;
        size++;
    }

    public void add(int index, int value) {
        ensureCapacity(elementData.length + 1);
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i -1];
        }
        elementData[index] = value;
        size++;
    }

    public void clear() {
        for (int i : elementData) {
            elementData[i] = 0;
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
