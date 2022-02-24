package ss6_ke_thua.bai_tap.PointMoveablePoint;

public class TestPoint {
    public static void main(String[] args) {
    MovablePoint movablePoint=new MovablePoint(4,5,9,10);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
