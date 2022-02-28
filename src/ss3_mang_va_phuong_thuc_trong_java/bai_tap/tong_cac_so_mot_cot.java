package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class tong_cac_so_mot_cot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        do {
            System.out.println("nhập kích thước m");
            m = scanner.nextInt();
            System.out.println("nhập kích thước n");
            n = scanner.nextInt();
        } while (m > 10 || n > 10);
        int arrays[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhập phần tử thứ " + i + " - " + j);

                arrays[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrays[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int rows = scanner.nextInt();
        System.out.println("nhập cột cần tính tổng rows");
        double sum = 0;
        for (int i = 0; i < m; i++) {
            sum += arrays[i][rows];
        }
        System.out.println("tổng ở cột " + rows + "là :" + sum);
    }


}
