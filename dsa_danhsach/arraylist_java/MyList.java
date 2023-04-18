package dsa_danhsach.arraylist_java;

import java.util.ArrayList;
import java.util.Arrays;


public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    static int getDefaultCapacity() {
        return DEFAULT_CAPACITY;
    }

    Object[] getElements() {
        elements = new Object[DEFAULT_CAPACITY];
        return elements;
    }

    void setElements(Object[] elements) {
        this.elements = elements;
    }

    void addMyList(int index, E element) {
        elements = new Object[DEFAULT_CAPACITY];
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException(index);
        } else {
            size++;
            elements = new Object[elements.length + size];
            for (int i = 0; i < elements.length; i++) {
                if (i == index) {
                    elements[index] = element;
                    break;
                }
            }
            for (int i = index + 1; i < elements.length; i++) {
                elements[i] = elements[i - 1];
            }
        }
    }

    E removeMyList(int index) {
        int i, j;
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException(index);
        } else {
            for (i = 0; i < elements.length; i++) {
                if (i == index) {
                    for (j = index; j < elements.length - 1; j++) {
                        elements[j] = elements[j - 1];
                    }
                }
            }
        }
        return (E) elements[index];
    }

    int sizeMyList() {
        return getSize();
    }

    E cloneMyList() {
        Object newarrr[] = new Object[elements.length];
        int index = 0;
        for (Object object : elements) {
            newarrr[index] = object;
            index++;
        }
        return (E) newarrr;

    }

    boolean containsMyList(E o) {
        for (Object object : elements) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }

    int indexofMyList(E o) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // void ensureCapacity(int minCapacity) {

    // }

    void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    void add(E o) {
        if (this.size == elements.length) {
            ensureCapa();
        }
        elements[size++] = o;
    }

    E getMyList(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    void clearMyList() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }
}
