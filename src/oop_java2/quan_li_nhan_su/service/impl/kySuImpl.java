package oop_java2.quan_li_nhan_su.service.impl;

import oop_java2.quan_li_nhan_su.models.kySu;
import oop_java2.quan_li_nhan_su.service.impl.IService.kySuService;
import ss12_java_collection_framework.bai_tap.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kySuImpl implements kySuService {
    static List<kySu> kySuList = new ArrayList<>();

    @Override
    public void addKySu() {
//        String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập họ và tên cần thêm mới:");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập năm sinh cần thêm mới");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính :");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ cần thêm mới:");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập ngành đào tạo cần thêm:");
        String nganhDaoTao = scanner.nextLine();
        kySu kySu = new kySu(hoTen, namSinh, gioiTinh, diaChi, nganhDaoTao);
        kySuList.add(kySu);
    }

    @Override
    public void searchKySu() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên kỹ sư cần tìm");
        String tenTimKiem=scanner.nextLine();
        for (int i = 0; i < kySuList.size(); i++) {
            if (check=kySuList.get(i).getHoTen().equals(tenTimKiem))
//            kySuList.contains(i);
            System.out.println("Đã tìm kiếm thành công");
            System.out.println(kySuList.get(i));

        }

    }

    @Override
    public void arrangeKySu() {
        kySuList.sort(kySu::compareTo);
        for (kySu kySu : kySuList)
            System.out.println(kySu);
    }

    @Override
    public void displayKySu() {
        for (kySu kySu : kySuList) {
            System.out.println(kySu);
        }
    }
}
