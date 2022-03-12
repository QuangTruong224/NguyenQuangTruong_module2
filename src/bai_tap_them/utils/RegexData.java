package bai_tap_them.utils;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String checkBienSoOto() {
        String checkBienSo;
        while (true) {
            System.out.println("Nhập biển số xe");
            checkBienSo = scanner.nextLine();
            Pattern pattern = Pattern.compile("^\\d{2}[AB]\\-\\d{3}\\.\\d{2}");
            if (pattern.matcher(checkBienSo).find()) {
                break;
            } else {
                System.out.println("Nhập sai mời nhập lại");
            }
        }
        return checkBienSo;
    }

    public static String checkBienSoXeTai() {
        String checkBienSo;
        while (true) {
            System.out.println("Nhập biển số xe");
            checkBienSo = scanner.nextLine();
            Pattern pattern = Pattern.compile("^\\d{2}[C]\\-\\d{3}\\.\\d{2}");
            if (pattern.matcher(checkBienSo).find()) {
                break;
            } else {
                System.out.println("Nhập sai mời nhập lại");
            }
        }
        return checkBienSo;
    }
    public static String checkBienSoXeMay() {
        String checkBienSo;
        while (true) {
            System.out.println("Nhập biển số xe");
            checkBienSo = scanner.nextLine();
            Pattern pattern = Pattern.compile("^\\d{2}[a-zA-z]{2}\\-\\d{3}\\.\\d{2}");
            if (pattern.matcher(checkBienSo).find()) {
                break;
            } else {
                System.out.println("Nhập sai mời nhập lại");
            }
        }
        return checkBienSo;
    }
}
