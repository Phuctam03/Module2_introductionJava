package inheritance.point2d_point3d;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;

        System.out.println("set X is :" + getX());
        System.out.println("set Y is :" + getY());
        System.out.println("set z is  :" + this.z);

    }

    public float[] getXYZ() {
        float arrayofxyz[] = { getX(), getY(), this.z };
        return arrayofxyz;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "[" + "z =" + this.z + "]";
    }
}
