package abstractclass_interface.resizeable;

public class Test {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];

        shape[0] = new Circle(3.0);
        shape[1] = new Rectangle(1.0, 1.0);
        shape[2] = new Square(1.0);
        System.out.println("The old Area :");
        for (Shape shape2 : shape) {
            System.out.println(shape2.getArea());

        }
        System.out.println("The New Area :");
        Resizeable r[] = new Resizeable[3];
        r[0] = new Circle(3.0);
        r[1] = new Rectangle(1.0, 1.0);
        r[2] = new Square(1.0);
        for (Resizeable resizeable : r) {
            resizeable.resize(5);
        }

    }
}
