package oop_review.phuong_tien.service.impl;

import oop_review.phuong_tien.controller.Menu;
import oop_review.phuong_tien.models.Oto;
import oop_review.phuong_tien.service.OtoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class otoImpl implements OtoService {
    static List<Oto> otoList = new ArrayList<>();

    @Override
    public void addOto() {
//        String bienKiemSoat, String hangSanXuat, int namSanXuat,
//        String chuSoHuu, int soChoNgoi, String kieuXe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("CHủ sỡ hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Số chỗ ngồi:");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu xe :");
        String kieuXe = scanner.nextLine();
        Oto oto = new Oto(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        otoList.add(oto);
    }

    @Override
    public void deleteOto() {
        boolean check=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số cần xóa:");
        String xoaBienSo=scanner.nextLine();
        for (int i = 0; i < otoList.size(); i++) {
            System.out.println(otoList.get(i).getBienKiemSoat());
            if (otoList.get(i).getBienKiemSoat().equals(xoaBienSo)) {
                check=true;
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        otoList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
    }

    @Override
    public void displayOto() {
        for (Oto oto : otoList) {
            System.out.println(oto);
        }

    }
}
