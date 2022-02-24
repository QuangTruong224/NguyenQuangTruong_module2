package ss3_mang_va_phuong_thuc_trong_java.Bai_tap;
import java.util.Scanner;
public class dem_so_lan_xuat_hien_ki_tu_o_chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi ");
        String chuoi1 = scanner.nextLine();
        char kiTu;
        System.out.println("nhập kí tự cần đếm");
        kiTu = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < chuoi1.length(); i++) {
            if (chuoi1.charAt(i) == kiTu) {
                count++;
            }
        }
        System.out.println(count);

    }
}
