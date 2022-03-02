package ss12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductManager productService = new ProductManager();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("--------MENU---------");
            System.out.println("1. Thêm sản phẩm: ");
            System.out.println("2. Sửa sản phảm: ");
            System.out.println("3. Xoá sản phẩm: ");
            System.out.println("4. Hiển thị sản phẩm: ");
            System.out.println("5. Tìm kiếm sản phẩm: ");
            System.out.println("6. Sắp xếp sản phẩm tăng dần: ");
            System.out.println("7. Sắp xếp sản phẩm giảm dần: ");
            System.out.println("8.Thoát! ");
            try {

                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {

                case 1:
                    productService.addProduct();

                    break;
                case 2:
                    productService.editProduct();

                    break;
                case 3:
                    productService.deleteProduct();

                    break;
                case 4:
                    productService.displayProduct();

                    break;
                case 5:
                    productService.searchProduct();

                    break;
                case 6:
                    productService.increaseProduct();

                    break;
                case 7:
                    productService.decreaseProduct();

                    break;
                case 8:
                    displayMenu();
                    break;
            }


        }

    }
}
