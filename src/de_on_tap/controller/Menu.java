package de_on_tap.controller;

import de_on_tap.service.DienThoaiChinhHangService;
import de_on_tap.service.DienThoaiXachTayService;
import de_on_tap.service.impl.DienThoaiChinhHangServiceImpl;
import de_on_tap.service.impl.DienThoaiXachTayServiceImpl;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Hiển thị danh sách điện thoại");
            System.out.println("4. TÌm kiếm điện thoại");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());


            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    addNew();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }

    public static void addNew() {
        DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangServiceImpl();
        DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayServiceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới điện thoại chính hãng ");
            System.out.println("2.  Thêm mới điện thoại xách tay ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.addNew();
                    break;
                case 2:
                    dienThoaiXachTayService.addNew();
                    break;
                case 3:
                    displayMenu();
                    break;

            }

        }
    }

    public static void delete() {
        boolean check = true;
        int choice = 0;
        DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangServiceImpl();
        DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayServiceImpl();
        while (check) {
            System.out.println("1. xóa Id điện thoại chính hang");
            System.out.println("2.  xóa Id diện thoại xách tay ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.delete();
                    break;
                case 2:
                    dienThoaiXachTayService.delete();
                    break;
                case 3:
                    displayMenu();
                    break;
            }

        }
    }

    public static void display() {
        boolean check = true;
        int choice = 0;
        DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangServiceImpl();
        DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayServiceImpl();
        while (check) {
            System.out.println("1. Hiển thị danh sách điện thoại chính hãng");
            System.out.println("2.  Hiển thị danh sách điện thoại xách tay ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.displayDT();
                    break;
                case 2:
                    dienThoaiXachTayService.displayDT();

                    break;
                case 3:
                    displayMenu();
                    break;
            }

        }
    }

    public static void search() {
        boolean check = true;
        int choice = 0;
        DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangServiceImpl();
        DienThoaiXachTayService dienThoaiXachTayService = new DienThoaiXachTayServiceImpl();
        while (check) {
            System.out.println("1. Tìm kiếm Id điện thoại chính hãng");
            System.out.println("2. Tìm kiếm Id điện thoại xách tay");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    dienThoaiChinhHangService.searchDT();
                    break;
                case 2:
                    dienThoaiXachTayService.searchDT();
                    break;
                case 3:
                    displayMenu();
                    break;
            }

        }
    }
}
