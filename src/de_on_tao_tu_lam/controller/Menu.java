package de_on_tao_tu_lam.controller;

import de_on_tao_tu_lam.service.BenhAnThuongService;
import de_on_tao_tu_lam.service.BenhAnVipService;
import de_on_tao_tu_lam.service.Impl.BenhAnThuongImpl;
import de_on_tao_tu_lam.service.Impl.BenhAnVipImpl;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("QUẢN LÝ ");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Hiển thị");
            System.out.println("4. Thoát");
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
                    System.exit(4);
                    break;
            }
        }

    }

    public static void addNew() {
        BenhAnThuongService benhAnThuongService = new BenhAnThuongImpl();
        BenhAnVipService benhAnVipService = new BenhAnVipImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.  Thêm mới bệnh án thường ");
            System.out.println("2.  Thêm mới bệnh án vip ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1:
                    benhAnThuongService.addBenhAnThuong();
                    break;
                case 2:
                    benhAnVipService.addBenhAnVip();
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
        BenhAnThuongService benhAnThuongService = new BenhAnThuongImpl();
        BenhAnVipService benhAnVipService = new BenhAnVipImpl();
        while (check) {
            System.out.println("1. xóa bệnh án thường ");
            System.out.println("2.  xóa bệnh án vip ");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
            switch (choice) {
                case 1:
                    benhAnThuongService.deleteBenhAnThuong();
                    break;
                case 2:
                    benhAnVipService.deleteBenhAnVip();
                    break;
                case 3:
                    displayMenu();
                    break;

            }

        }
    }

    public static void display (){
        boolean check=true;
        BenhAnThuongService benhAnThuongService = new BenhAnThuongImpl();
        BenhAnVipService benhAnVipService = new BenhAnVipImpl();
        int choice = 0;

        while (check) {
            System.out.println("1.  Hiển thị bênh án thường  ");
            System.out.println("2.  Hiển thị  bệnh án vip");
            System.out.println("3. Thoát");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");

            }
            switch (choice) {
                case 1 :
                   benhAnThuongService.displayBenhAnThuong();
                    break;
                case 2 :
                    benhAnVipService.displayBenhAnVip();
                    break;

                case 3 :displayMenu();
                    break;
            }

        }
    }


}

