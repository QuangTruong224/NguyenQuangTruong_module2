package ss6_ke_thua.thuc_hanh;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("blue",false,4);
        System.out.println(circle);

        circle = new Circle("red",false,3.5);
        System.out.println(circle);
    }
    }

