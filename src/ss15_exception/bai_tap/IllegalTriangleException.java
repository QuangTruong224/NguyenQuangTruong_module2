package ss15_exception.bai_tap;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        IllegalTriangleException triangleException=new IllegalTriangleException();
        try {
            triangleException.triagle();
        } catch (ExceptionRectangle e) {
            e.printStackTrace();
        }

    }

    public void triagle() throws ExceptionRectangle {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài a của tam giác");
        int a = scanner.nextInt();
        System.out.println("Nhập độ dài b của tam giác");
        int b = scanner.nextInt();
        System.out.println("Nhập độ dài c của tam giác");
        int c = scanner.nextInt();
        if (a < 0 || b < 0 || c < 0 || (a + b) <= c || (b + c) <= a || (a + c) <= b) {
            throw new IllegalArgumentException("Tam giác không hợp lệ");
        }else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
