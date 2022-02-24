package Ss6_ke_thua.Bai_tap.point_2D_point_3D;
public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {
    }

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
    }

    public float[] getXYZ() {
        float[] arr = {this.getX(), this.getY(), z};
        return arr;
    }

    @Override
    public String toString() {
        return "The Point3D has x,y,z respectively: " + this.getX() + this.getY() + getZ() + ", which is a subclass of " + super.toString();
    }
}
