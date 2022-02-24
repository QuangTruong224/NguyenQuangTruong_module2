package ss2_vong_lap_trong_jav.Thuc_hanh;
import java.util.Scanner;
public class uoc_chung_so_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
                System.out.println("Greatest common factor: " + a);
            }
        }
    }
}
