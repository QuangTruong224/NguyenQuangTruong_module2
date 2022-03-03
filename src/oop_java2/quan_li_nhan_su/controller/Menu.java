package oop_java2.quan_li_nhan_su.controller;

import oop_java2.quan_li_nhan_su.service.impl.IService.congNhanService;
import oop_java2.quan_li_nhan_su.service.impl.IService.kySuService;
import oop_java2.quan_li_nhan_su.service.impl.IService.nhanVienService;
import oop_java2.quan_li_nhan_su.service.impl.congNhanImpl;
import oop_java2.quan_li_nhan_su.service.impl.kySuImpl;
import oop_java2.quan_li_nhan_su.service.impl.nhanVienImpl;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("QUẢN LÝ THÔNG TIN CÁN BỘ!!!");
            System.out.println("1.Nhập thông tin mới cho cán bộ:");
            System.out.println("2.Tìm kiếm theo tên cán bộ");
            System.out.println("3.Sắp xếp theo tên");
            System.out.println("4.Hiển thị thông tin về danh sách cán bộ");
            System.out.println("5.Thoát khỏi chương trình");
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
                    search();
                    break;
                case 3:
                    arrange();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        }

    }

    public static void addNew() {
        kySuService kySuService = new kySuImpl();
        congNhanService congNhanService = new congNhanImpl();
        nhanVienService nhanVienService = new nhanVienImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới kỹ sư ");
            System.out.println("2.  Thêm mới công nhân ");
            System.out.println("3. Thêm mới nhân viên");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    kySuService.addKySu();
                    break;
                case 2:
                    congNhanService.addCongNhan();
                    break;
                case 3:
                    nhanVienService.addNhanVien();
                case 4:
                    displayMenu();
                    break;

            }

        }
    }

    public static void search() {
        boolean check = true;
        int choice = 0;
        kySuService kySuService = new kySuImpl();
        congNhanService congNhanService = new congNhanImpl();
        nhanVienService nhanVienService = new nhanVienImpl();
        while (check) {
            System.out.println("1. Tìm kiếm thông tin kỹ sư ");
            System.out.println("2. Tìm kiếm thông tin công nhân");
            System.out.println("3. Tìm kiếm thông tin nhân viên");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    kySuService.searchKySu();
                    break;
                case 2:
                    congNhanService.searchCongNhan();
                    break;
                case 3:
                    nhanVienService.searchNhanVien();
                    break;
                case 4:
                    displayMenu();
                    break;

            }

        }

    }

    public static void arrange() {
        boolean check = true;
        int choice = 0;
        kySuService kySuService = new kySuImpl();
        congNhanService congNhanService = new congNhanImpl();
        nhanVienService nhanVienService = new nhanVienImpl();
        while (check) {
            System.out.println("1. Sắp  xếp thông tin kỹ sư ");
            System.out.println("2. Sắp xếp thông tin công nhân");
            System.out.println("3. Sắp xếp thông tin nhân viên");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    kySuService.arrangeKySu();
                    break;
                case 2:
                    congNhanService.arrangeCongNhan();
                    break;
                case 3:
                    nhanVienService.arrangeNhanVien();
                    break;
                case 4:
                    displayMenu();
                    break;
            }
        }
    }

    public static void display() {
        boolean check = true;
        int choice = 0;
        kySuService kySuService = new kySuImpl();
        congNhanService congNhanService = new congNhanImpl();
        nhanVienService nhanVienService = new nhanVienImpl();
        while (check) {
            System.out.println("1.  Hiển thị thông tin kỹ sư ");
            System.out.println("2.  Hiển thị thông tin công nhân ");
            System.out.println("3. Hiển thị thông tin nhân viên");
            System.out.println("4. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    kySuService.displayKySu();
                    break;
                case 2:
                    congNhanService.displayCongNhan();
                    break;
                case 3:
                    nhanVienService.displayNhanVien();
                    break;
                case 4:
                    displayMenu();
                    break;
            }

        }
    }


}