package dsa_danhsach.linkedlist_java;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private LinkedList<E> linkerList = new LinkedList<E>();
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(Node head, int numNodes) {
        this.head = head;
        this.numNodes = numNodes;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getNumNodes() {
        return numNodes;
    }

    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }

    void addLinked(int index, E element) {
        linkerList.add(index, element);
        ;
    }

    void addFirstLinked(E e) {
        linkerList.addFirst(e);
    }

    void addLastLinked(E e) {
        linkerList.addLast(e);
    }

    E removeLinkedList(int index) {
        return linkerList.remove(index);
    }

    boolean remove(E e) {
        return linkerList.remove(e);
    }

    int amount() {
        return linkerList.size();
    }

    E cloneLinked() {
        return (E) linkerList.clone();

    }

    boolean contains(E e) {
        return linkerList.contains(e);
    }

    int indexofLinkedlist(E o) {
        return linkerList.indexOf(o);
    }

    boolean add(E e) {
        return linkerList.add(e);
    }

    void ensureCappacity(int minCapacity) {

    }

    E getLinked(int i) {
        return linkerList.get(i);
    }

    E getFirst() {
        return linkerList.getFirst();
    }

    E getLast() {
        return linkerList.getLast();
    }

    void clear() {
        linkerList.clear();
    }
}
