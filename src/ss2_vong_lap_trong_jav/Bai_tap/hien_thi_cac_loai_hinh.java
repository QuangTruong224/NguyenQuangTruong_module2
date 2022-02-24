package Ss2_vong_lap_trong_jav.Bai_tap;
import java.util.Scanner;
public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int a = 10;
        int b = 17;
        switch (input) {
            case 1:

                for (int i=0;i<a;i++ ) {
                    for ( int j=0;j<b;j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            case 2:
                System.out.println(" Chọn vị trí góc vuông của tam giác");
                System.out.println("1. Góc vuông ở bên trái phía dưới");
                System.out.println("2. Góc vuông ở bên trái phía trên");
                System.out.println("3. Góc vuông ở bên phải phía dưới");
                System.out.println("4. Góc vuông ở bên phải phía trên");
                System.out.println("5. Thoát");
                System.out.println("Nhập từ 1 đến 5 để lựa chọn chức năng");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        for (int i = 0; i < a; i++) {
                            for (int x = 0; x < i; x++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < a; i++) {
                            for (int x = 0; x < (a - i); x++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for (int i = 0; i < a; i++) {

                            for (int x = 0; x < (a - i); x++) {
                                System.out.print(" ");
                            }
                            for (int x = 0; x < i; x++) {
                                System.out.print("* ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        for (int i = 0; i < a; i++) {
                            for (int x = 0; x < i; x++) {
                                System.out.print("  ");
                            }
                            for (int x = 0; x < (a - i); x++) {
                                System.out.print(" *");
                            }
                            System.out.println("");
                        }
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                for ( int i = 0; i<7;i++) {
                    for ( int j =i ; j<7;j++) {
                        System.out.print(" * ");
                    }
                    System. out.println("  ");

                }
        }
    }
}

