package dsa_danhsach.arraylist_java;

import java.util.ArrayList;
import java.util.Arrays;


public class MyList<E> {
    private ArrayList<E> mylist = new ArrayList<E>();
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(ArrayList<E> mylist, int size, Object[] elements) {
        this.mylist = mylist;
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
        return elements;
    }

    void setElements(Object[] elements) {
        this.elements = elements;
    }

    void addMyList(int index, E element) {
        mylist.add(index, element);

    }

    E removeMyList(int index) {
        return mylist.remove(index);
    }

    int sizeMyList() {
        return mylist.size();
    }

    E cloneMyList() {
        return (E) mylist.clone();
    }

    boolean containsMyList(E o) {
        return mylist.contains(o);
    }

    int indexofMyList(E o) {
        return mylist.indexOf(o);
    }

    boolean addList(E o) {
        return mylist.add(o);
    }

    void ensureCapacity(int minCapacity) {
        minCapacity = elements.length / 2;
        elements = Arrays.copyOf(elements, minCapacity);
    }

    E getMyList(int i) {
        return mylist.get(i);
    }

    void clearMyList() {
        mylist.clear();

    }

}
