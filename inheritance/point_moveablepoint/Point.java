package inheritance.point_moveablepoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    protected void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    protected float[] getXY() {
        float array[] = { this.x, this.y };
        return array;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }


}
