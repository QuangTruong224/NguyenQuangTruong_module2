package de_thi_c10.controller;

import bai_tap_them.service.OtoService;
import bai_tap_them.service.XeMayService;
import bai_tap_them.service.XeTaiService;
import bai_tap_them.service.impl.OtoImpl;
import bai_tap_them.service.impl.XeMayImpl;
import bai_tap_them.service.impl.XeTaiImpl;
import de_thi_c10.service.NhapKhauService;
import de_thi_c10.service.XuatKhauService;
import de_thi_c10.service.impl.NhapKhauImpl;
import de_thi_c10.service.impl.XuatKhauImpl;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("QUẢN LÝ SẢN PHẨM");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Hiển thị sản phẩm");
            System.out.println("4. TÌm kiếm sản phẩm");
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
        NhapKhauService nhapKhauService = new NhapKhauImpl();
        XuatKhauService xuatKhauService = new XuatKhauImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới sản phẩm nhập khẩu ");
            System.out.println("2.  Thêm mới sản phẩm xuất khẩu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    nhapKhauService.addNew();
                    break;
                case 2:
                    xuatKhauService.addNew();
                    break;
                case 3:
                    displayMenu();
                    break;

            }

        }
    }

    public static void delete() {
        boolean check = true;
        int choice=0;
        NhapKhauImpl nhapKhauService = new NhapKhauImpl();
        XuatKhauImpl xuatKhauService = new XuatKhauImpl();
        while (check) {
            System.out.println("1. xóa sản phẩm nhập khẩu");
            System.out.println("2.  xóa sản phẩm xuất khấu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    nhapKhauService.delete();
                    break;
                case 2:
                    xuatKhauService.delete();
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
        NhapKhauService nhapKhauService = new NhapKhauImpl();
        XuatKhauService xuatKhauService = new XuatKhauImpl();
        while (check) {
            System.out.println("1. Hiển thị sản phẩm nhập khẩu");
            System.out.println("2.  Hiển thị phẩm xuất khấu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    nhapKhauService.display();
                    break;
                case 2:
                    xuatKhauService.display();

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
        NhapKhauService nhapKhauService = new NhapKhauImpl();
        XuatKhauService xuatKhauService = new XuatKhauImpl();
        while (check) {
            System.out.println("1. Tìm kiếm sản phẩm nhập khẩu");
            System.out.println("2. Tìm kiếm phẩm xuất khấu ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    nhapKhauService.search();
                    break;
                case 2:
                   xuatKhauService.search();
                    break;
                case 3:
                    displayMenu();
                    break;
            }

        }
    }
}
