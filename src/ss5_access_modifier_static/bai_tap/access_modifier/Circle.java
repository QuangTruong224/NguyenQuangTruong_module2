package ss5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    double radius=1.0;
    String color= "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle circle=new Circle();
        Circle circle1=new Circle(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
