package inheritance.triangle;

public class Triangle extends  Shape{

    private String color;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter() * (getPerimeter() - this.side1) * (getPerimeter() * this.side2)
                * (getPerimeter() * this.side3));

    }

    @Override
    public double getPerimeter() {

        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + "Color :" + this.color + " The Perimeter is :" + getPerimeter()
                + "The Area is :" + getArea();
    }

}
