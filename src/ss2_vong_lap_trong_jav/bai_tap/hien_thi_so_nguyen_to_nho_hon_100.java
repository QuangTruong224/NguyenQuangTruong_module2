package ss2_vong_lap_trong_jav.bai_tap;

import java.util.Scanner;

public class hien_thi_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập n số nguyên ");
        int n;
        for (int i = 0; i < 100; i++) {

            if (kiemTraSNT(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean kiemTraSNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
