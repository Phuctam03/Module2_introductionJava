package lopvadoituong;

public class Fan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private boolean on;
    private int speed = slow;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public Fan(boolean on, int speed, double radius, String color) {
        this.on = on;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public String testFan(boolean fan) {
        if (fan == true) {
            return "Speed :" + this.speed + "Color :" + this.color + "radius :" + this.radius;
        } else if (fan == false) {
            return "Color :" + this.color + "radius :" + this.radius;
        }
        return null;
    }

    @Override
    public String toString() {
        return ((this.on == true) ? "fan is on"
                : "fan is off") +    testFan(on);
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(true, 10, 10, "yellow");
        Fan fan2 = new Fan(false, 5, 5, "blue");


        System.out.println("Fan 1 :" + fan1.toString());
        System.out.println("Fan 2" + fan2.toString());
    }

}
