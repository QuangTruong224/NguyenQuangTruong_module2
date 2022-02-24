package ss7_abstract_interface.bai_tap.resizeable;
public class Circle extends Shape {
     double radius = 2;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


    public void resize(double percent) {
        this.radius *= percent;
    }
}
