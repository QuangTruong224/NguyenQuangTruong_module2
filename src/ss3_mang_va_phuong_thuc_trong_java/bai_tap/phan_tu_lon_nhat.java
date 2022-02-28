package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class phan_tu_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;


        do {
            System.out.println("nhập kích thước m");
            m = scanner.nextInt();
            System.out.println("nhập kích thước n");
            n = scanner.nextInt();
        } while (m > 10 && n > 10);
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhập phần tử thứ " + i + " - " + j);

                arr[i][j] = scanner.nextInt();
            }


        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");

        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }

        }

        System.out.println("phần tử lớn nhất là :" + max);
    }

}
