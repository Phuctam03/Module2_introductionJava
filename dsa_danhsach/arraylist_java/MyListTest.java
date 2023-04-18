package dsa_danhsach.arraylist_java;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> mylist = new MyList<String>();
        MyList<String> a = new MyList<>();

        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        System.out.println("phần tử được lấy ra theo index :" + a.getMyList(0));
        System.out.println("Phần tử xóa và trả về theo vị trí" + a.removeMyList(4));

        System.out.println(a.containsMyList("A"));

    }
}
