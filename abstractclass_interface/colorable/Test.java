package abstractclass_interface.colorable;

public class Test {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];
        s[0] = new Circle(1.0);
        s[1] = new Rectangle(1.0, 1.0);
        s[2] = new Square(1.0);
        for (Shape shape : s) {
            System.out.println("The Area Every Shape is :" + (shape.getArea()));
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }
        }

    }
}
