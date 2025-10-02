/* Exercise 16: stutter
Write a new method for the ArrayIntList class named stutter that replaces every value with two of that value.
For example, if the list initially stores [42, 7, 0, -3, 15],
after the call it should store [42, 42, 7, 7, 0, 0, -3, -3, 15, 15].

Assume you are adding to the ArrayIntList class with following members:
 */

public class Lab1 {

    private int[] elementData;
    private int size;

    // construct a new empty list of capacity 10
    public ArrayIntList() {
    }

    // add to end of list
    public void add(int value) {
    }

    // throw ArrayIndexOutOfBoundsException if index not between min/max inclusive
    private void checkIndex(int index, int min, int max) {
    }

    // ensure that elementData.length >= capacity
    private void ensureCapacity(int capacity) {
    }


    // YOUR CODE GOES HERE
    // This is the method that is being asked

    public void stutter() {
        int[] newElements = new int[size * 2];
        int i = 0;
        for (int j = 0; j < size; j++) {
            newElements[i] = elementData[j];
            newElements[i + 1] = elementData[j];
            i += 2;
            }
        elementData = newElements;
        size = newElements.length;
    }

}
