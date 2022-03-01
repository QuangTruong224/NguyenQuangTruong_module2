package oop_review.phuong_tien.service.impl;


import oop_review.phuong_tien.controller.Menu;
import oop_review.phuong_tien.models.XeTai;
import oop_review.phuong_tien.service.XeTaiService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xeTaiImpl implements XeTaiService {
    static List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void addXeTai() {
//        String bienKiemSoat, String hangSanXuat,
//        int namSanXuat, String chuSoHuu, String trongTai
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soat:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Hãng sản xuất:");
        String hangXanSuat = scanner.nextLine();
        System.out.println("Năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("CHủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Trọng tải xe :");
        String trongTai = scanner.nextLine();
        XeTai xeTai = new XeTai(bienKiemSoat, hangXanSuat, namSanXuat, chuSoHuu, trongTai);
        xeTaiList.add(xeTai);
    }

    @Override
    public void deleteXeTai() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        System.out.println("Nhập biển số cần xóa:");
        String xoaBienSo = scanner.nextLine();
        for (int i = 0; i < xeTaiList.size(); i++) {
            System.out.println(xeTaiList.get(i).getBienKiemSoat());
            if (xeTaiList.get(i).getBienKiemSoat().equals(xoaBienSo)) {
                check = true;
                System.out.println("Bạn có muốn xóa chứ?");
                System.out.println("1.Có chứ");
                System.out.println("2.Không chứ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xeTaiList.remove(i);
                        System.out.println("Đã xóa cho bạn!");
                        break;
                    case 2:
                        Menu.displayMenu();
                }
            }


        }
    }

    @Override
    public void displayXeTai() {
        for (XeTai xeTai : xeTaiList
        ) {
            System.out.println(xeTai);

        }
    }
}
