package dsa_danhsach.linkedlist_java;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<String>();

        mylist.addLinked(0, "A");
        mylist.addLinked(1, "B");
        mylist.addLinked(2, "C");
        mylist.addLinked(3, "D");
        mylist.addLinked(4, "E");
        mylist.addLinked(5, "F");

        System.out.println("Element 1 is :" + mylist.getLinked(0));
        System.out.println("Element 2 is :" + mylist.getLinked(1));
        System.out.println("Element 3 is :" + mylist.getLinked(2));
        System.out.println("Element 4 is :" + mylist.getLinked(3));
        System.out.println("Element 5 is :" + mylist.getLinked(4));

        mylist.addFirstLinked("G");
        mylist.addLastLinked("U");
        System.out.println("NewElement First is :" + mylist.getLinked(0));
        System.out.println("NewElement  Last is :" + mylist.getLinked(7));

        mylist.addLinked(0, "G");
        mylist.addLinked(1, "H");
        mylist.addLinked(2, "I");
        mylist.addLinked(3, "E");
        mylist.addLinked(4, "K");
        mylist.addLinked(5, "T");

        System.out.println("Elements  First is :" + mylist.getFirst());
        System.out.println("Elements Last is :" + mylist.getLast());

        System.out.println("elements in array is :" + mylist.remove("D"));
        System.out.println("elements in array is :" + mylist.remove("UG"));

        System.out.println("Elements in array has exist :" + mylist.contains("D"));

        mylist.clear();

    }
}
