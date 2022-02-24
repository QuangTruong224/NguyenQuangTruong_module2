package ss1_Introduction_to_Jav.Thuc_hanh;

import java.util.Scanner;

public class tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập tháng mà bạn muốn đếm ngày");
        int thang = input.nextInt();

        switch (thang) {
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày ");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày ");
                break;
            default:
                System.out.println("KHông hợp lệ !!!");

        }
    }
}

