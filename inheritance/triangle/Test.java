package inheritance.triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1, side2, side3;
        String Color;
        System.out.println("Enter the Side 1 :");
        side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the Side 2 :");
        side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the Side 3 :");
        side3 = Double.parseDouble(sc.nextLine());
        System.out.println("Enter the Color :");
        Color = sc.nextLine();

        Shape shape = new Triangle(side1, side2, side3, Color);

        System.out.println("information of Triangle is :" + shape.toString());
    }
}
