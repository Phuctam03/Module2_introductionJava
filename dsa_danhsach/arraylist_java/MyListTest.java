package dsa_danhsach.arraylist_java;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> mylist = new MyList<String>();

        mylist.addMyList(0, "A");
        mylist.addMyList(1, "B");
        mylist.addMyList(2, "C");
        mylist.addMyList(3, "D");
        mylist.addMyList(4, "E");
        mylist.addMyList(5, "F");

        System.out.println("elements 1 :" + mylist.getMyList(0));
        System.out.println("elements 2 :" + mylist.getMyList(1));
        System.out.println("elements 3 :" + mylist.getMyList(2));
        System.out.println("elements 4 :" + mylist.getMyList(3));
        System.out.println("elements 5 :" + mylist.getMyList(4));
        System.out.println("elements 6 :" + mylist.getMyList(5));

        System.out.println("Amount is :" + mylist.sizeMyList());

        System.out.println("Remove elements 3 is :" + mylist.removeMyList(2));

        System.out.println("The Test ELement 3 in myList is :" + mylist.containsMyList("A"));
        System.out.println("The Test ELement 3 in myList is :" + mylist.containsMyList("C"));

        System.out.println("Index of Elements D in mylist is :" + mylist.indexofMyList("D"));

        System.out.println("Test :" + mylist.addList("G"));

        // String newArray = mylist.cloneMyList();
        // for (int i = 0; i < newArray.length(); i++) {
        //     System.out.println(newArray.charAt(i) + " ");

        // }
        mylist.clearMyList();

    }
}
