package access_static.students;

public class Test {
    public static void main(String[] args) {
        Students st = new Students();
        System.out.println("old name :" + st.getName());
        System.out.println(" old classes :" + st.getClasses());
        st.setName("Tâm");
        st.setClasses("DTU");
        System.out.println("new Name :" + st.getName());
        System.out.println("new classes :" + st.getClasses());



    }
}
