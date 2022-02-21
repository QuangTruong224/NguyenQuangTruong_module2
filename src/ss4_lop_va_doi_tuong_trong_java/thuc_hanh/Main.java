package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the width");
        double width= scanner.nextDouble();
        System.out.println("Enter the height");
        double height= scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle : " + rectangle.getPremeiter());
        System.out.println("Area of the Rectangle"+ rectangle.getArea());
    }

}
