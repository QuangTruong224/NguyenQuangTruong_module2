package ss3_mang_va_phuong_thuc_trong_java.Thuc_hanh;
import java.util.Scanner;

class dao_nguoc_cac_phan_tu_mang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size : ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("không được nhập lớn hơn 20 phần tử");

            }

        } while (size > 20) ;
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập phần tử :" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}