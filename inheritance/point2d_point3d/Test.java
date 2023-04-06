package inheritance.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.5f, 4.2f);
        Point3D p3d = new Point3D(4.2f, 2.0f, 3.0f);

        System.out.println(p2d.toString());
        System.out.println(p3d.toString());

        System.out.println("The values xy is :");

        float arrayofxy[] = p2d.getXY();
        for (int i = 0; i < arrayofxy.length; i++) {
            System.out.println(arrayofxy[i] + " ");
        }

        System.out.println("The values xyz is :");
        float arrayofxyz[] = p3d.getXYZ();
        for (int i = 0; i < arrayofxyz.length; i++) {
            System.out.println(arrayofxyz[i] + " ");
        }

        p2d.setXY(4.5f, 3.2f);
        p3d.setXYZ(2.5f, 3.2f, 10.0f);
    }
}
