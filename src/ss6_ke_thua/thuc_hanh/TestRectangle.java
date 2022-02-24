package ss6_ke_thua.thuc_hanh;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(3,5);
        System.out.println(rectangle);
        rectangle=new Rectangle("red",false,5,3);
        System.out.println(rectangle);
    }
}
