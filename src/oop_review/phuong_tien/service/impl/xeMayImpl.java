package oop_review.phuong_tien.service.impl;

import oop_review.phuong_tien.controller.Menu;
import oop_review.phuong_tien.models.XeMay;
import oop_review.phuong_tien.service.XeMayService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xeMayImpl implements XeMayService {
    static List<XeMay> xeMayList=new ArrayList<>();
    @Override
    public void addXeMay() {
//        String bienKiemSoat, String hangSanXuat,
//        int namSanXuat, String chuSoHuu, String congSuat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("CHủ sỡ hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Công suất xe;");
        String congSuatXe=scanner.nextLine();
        XeMay xeMay=new XeMay(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congSuatXe);
        xeMayList.add(xeMay);
    }

    @Override
    public void deleteXeMay() {
    boolean check=false;
    Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập biển số cần  xóa:");
        String xoaBienSo=scanner.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            System.out.println(xeMayList.get(i).getBienKiemSoat());
            if (xeMayList.get(i).getBienKiemSoat().equals(xoaBienSo)) {
                check=true;
                System.out.println("Bạn có muốn xóa hông nè:");
                System.out.println("1.Có xóa nè!");
                System.out.println("2.Hông bro!");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xeMayList.remove(i);
                        System.out.println("Xóa rồi nè");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }

        }
    }

    @Override
    public void displayXeMay() {
        for (XeMay xeMay:xeMayList) {
            System.out.println(xeMay);
        }
    }
}
