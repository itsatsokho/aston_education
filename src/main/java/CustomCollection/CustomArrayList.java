package CustomCollection;

import java.util.Arrays;
import java.util.Collection;

public class CustomArrayList<E> extends CustomComparator implements CustomList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double RESIZE_KF = 1.5;
    private E[] elementData;
    private int size;
    private int n;

    //initialize default CustomArrayList
    public CustomArrayList() {
        this.elementData = (E[]) new Object[DEFAULT_CAPACITY];
        size = DEFAULT_CAPACITY;
    }

    //initialize CustomArrayList with initial capacity
    public CustomArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = (E[]) new Object[initialCapacity];
            size = initialCapacity;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    //initialize CustomArrayList from Collection
    public CustomArrayList(Collection<? extends E> c) {
        this.elementData = (E[]) new Object[c.size()];
        size = c.size();
        addAll(c);
    }


    //add one element
    @Override
    public void add(E element) {
        checkRange(n);
        elementData[n] = element;
        n++;
    }

    //add one element in definite position
    @Override
    public void add(int index, E element) {
        if (index >= 0) {
            checkRange(index);
            elementData[index] = element;
        } else {
            throw new IllegalArgumentException("Incorrect index :" + index);
        }

    }

    //get one element from index
    @Override
    public E get(int index) {
        if (elementData[index] != null) {
            return elementData[index];
        } else {
            throw new IllegalArgumentException("Element with index " + index + " does not exist");
        }
    }

    //remove one element from index
    @Override
    public void remove(int index) {
        if (elementData[index] != null) {
            if (elementData[index+1] != null){
                System.arraycopy(elementData, index + 1, elementData, index, elementData.length - index - 1);
                elementData[index+1] = null;
            } else {
                elementData[index] = null;
            }
        } else {
            throw new IllegalArgumentException("Incorrect index");
        }
    }

    //add all elements from Collection to CustomArrayList
    @Override
    public void addAll(Collection<? extends E> c) {
        E[] tmp =(E[]) c.toArray();
        System.arraycopy(tmp, 0, elementData, 0, tmp.length);
    }

    //Bubble Sort Collection
    public static <T extends Comparable<T>> void bubbleCollectionSort(Collection<T> collection) {
        Object[] tmp = collection.toArray();
        Object temp;
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 1; i < tmp.length; i++) {
                    if (((T)tmp[i - 1]).compareTo((T)tmp[i]) > 0) {
                        temp = tmp[i - 1];
                        tmp[i - 1] = tmp[i];
                        tmp[i] = temp;
                        isSorted = false;
                    }
            }
        } while (!isSorted);
        collection.clear();
        for (Object o : tmp) {
            collection.add((T) o);
        }
    }

    //Bubble Sort CustomArrayList
    public static <T extends Comparable<T>> void bubbleCustomCollectionSort(CustomArrayList<T> c) {
        Object[] tmp = c.elementData;
        Object temp;
        boolean isSorted;
        do {
            isSorted = true;
            for (int i = 1; i < tmp.length; i++) {
                if (new CustomComparator<T>().compare((T)tmp[i - 1], (T)tmp[i]) > 0) {
                    temp = tmp[i - 1];
                    tmp[i - 1] = tmp[i];
                    tmp[i] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }


    //checking range of inside array. If index > array length then array length resized.
    private void checkRange(int index) {
        while (index >= elementData.length) {
            resized();
        }
    }

    //resize array length
    private void resized() {
        E[] resize = (E[]) new Object[(int) (size * RESIZE_KF)];
        System.arraycopy(elementData, 0, resize, 0, elementData.length);
        this.elementData = resize;
        size = elementData.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                ", size=" + size +
                ", n=" + n +
                '}';
    }
}

