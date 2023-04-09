package abstractclass_interface.resizeable;

public class Square extends  Shape implements Resizeable{
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }



    @Override
    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "Square [size=" + size + "The Area is :" + getArea() + "]";
    }

    @Override
    public void resize(double percent) {
        System.out.println("Percent Square is :" + (getArea() * percent));

    }

}
