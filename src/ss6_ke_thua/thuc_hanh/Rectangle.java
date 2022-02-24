package ss6_ke_thua.thuc_hanh;

public class Rectangle extends Shape{
    private double lengh=1.0;
    private double width=2.0;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double lengh, double width) {
        super(color, filled);
        this.lengh = lengh;
        this.width = width;
    }

    public Rectangle(double lengh, double width) {
        this.lengh = lengh;
        this.width = width;
    }

    public double getLengh() {
        return lengh;
    }

    public void setLengh(double lengh) {
        this.lengh = lengh;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lengh=" + lengh +
                ", width=" + width +
                "} " + super.toString();
    }
}
