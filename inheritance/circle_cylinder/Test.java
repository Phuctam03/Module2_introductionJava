package inheritance.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.5, "Blue");
        Cylinder c2 = new Cylinder(4.5, "Red", 3.6);
        System.out.println("Infor of The Circle is :" + c1.toString());
        System.out.println("Infor of the Cylinder is :" + c2.toString());

    }
}
