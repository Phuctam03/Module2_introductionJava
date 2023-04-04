package access_static.access;

public class Accessmodi {
    private double radius = 1.0;
    private String color = "red";

    public Accessmodi() {
    }

    public Accessmodi(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Accessmodi access = new Accessmodi();
        System.out.println("Radius 1 is :"+access.getRadius());
        System.out.println("Area 1 is a :"+access.getArea());
    }
}


