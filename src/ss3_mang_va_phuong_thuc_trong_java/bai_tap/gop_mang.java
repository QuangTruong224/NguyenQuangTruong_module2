package ss3_mang_va_phuong_thuc_trong_java.bai_tap;
import java.util.Scanner;
public class gop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays1;
        int[] arrays2;
        int n;
        int[] arrays3;
        do {
            System.out.println("nhập kích thước mảng :");
            n = scanner.nextInt();
        } while (n > 10);
        arrays1 = new int[n];
        arrays2 = new int[n];
        arrays3 = new int[2*n];

        for (int i = 0; i <n; i++) {
            System.out.println("nhập vào phần tử thứ " + i);
            arrays1[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println("nhập vào phần tử thứ " + j);
            arrays2[j] = scanner.nextInt();
        }
        int d = 0 ;
        for (int k = 0; k < n; k++) {
            arrays3[d] = arrays1[k];
            d++;
        }
        for (int k= 0; k < n; k++) {
            arrays3[d] = arrays2[k];
            d++;
        }
        for (int k = 0; k < 2*n; k++) {
            System.out.println( arrays3[k]);
        }
    }
}
