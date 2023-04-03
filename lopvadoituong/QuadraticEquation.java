package lopvadoituong;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        delta = Math.pow(this.b, 2) - (4 * a * c);
        return delta;

    }

    public double getRoot1() {
        return (-this.b + (Math.sqrt(getDiscriminant()))) / (2 * a);
    }

    public double getRoot2() {
        return (-this.b - (Math.sqrt(getDiscriminant()))) / (2 * a);
    }

    public void display() {
        if (getDiscriminant() > 0) {
            System.out.println("the equation has 2 solutions");
            System.out.println("r1 =" + getRoot1() + " and " + "r2 =" + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("the equation has solution");
            System.out.println("r = " + (-this.b / (2 * this.a)));
        } else {
            System.out.println("The equation has  no roots");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter the number :");
        a = Double.parseDouble(sc.nextLine());
        b = Double.parseDouble(sc.nextLine());
        c = Double.parseDouble(sc.nextLine());
        QuadraticEquation equations = new QuadraticEquation(a, b, c);
        equations.display();
    }
}
