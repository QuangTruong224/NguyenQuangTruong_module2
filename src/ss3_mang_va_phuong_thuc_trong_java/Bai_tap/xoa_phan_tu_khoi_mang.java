package ss3_mang_va_phuong_thuc_trong_java.Bai_tap;
import java.util.Scanner;
public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] delete;
        int n =0;
        do {
            System.out.println("nhập kích thước mảng : ");
            n = scanner.nextInt();
        } while (n <0);

        delete = new int[n];
        for (int i = 0; i < delete.length; i++) {
            System.out.println("nhập vào phần tử thứ " + i);
            delete[i] = scanner.nextInt();
        }
        for (int i = 0; i < delete.length; i++) {
            System.out.print(delete[i]);
        }
        System.out.println("nhập vào số cần xóa");
        int timKiem = scanner.nextInt();
        for (int i = 0; i < delete.length; i++) {
            if (timKiem == delete[i]) {
                for (int j = i; j < delete.length - 1; j++) {
                    delete[j] = delete[j + 1];
                }
                delete[delete.length - 1] = 0;
            }

        }
        for (int i=0;i<delete.length;i++) {
            System.out.println(delete[i]);
        }
    }
}

