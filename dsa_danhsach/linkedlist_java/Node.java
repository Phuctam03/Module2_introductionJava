package dsa_danhsach.linkedlist_java;

public class Node {
    private Node next;
    private Object data;

    public Node() {
    }

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
