package inheritance.point_moveablepoint;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    MovablePoint() {
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float array[] = { this.xSpeed, this.ySpeed };

        return array;
    }

    @Override
    public String toString() {
        return super.toString() + "xSpeed :" + this.xSpeed + "ySpeed:" + this.ySpeed;
    }

    public float[] move() {
        float x1 = getX();
        float y1 = getY();
        x1 += this.xSpeed;
        y1 += this.ySpeed;
        float array[] = { x1, y1 };
        return array;

    }
}
