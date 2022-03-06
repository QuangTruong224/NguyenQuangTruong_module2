package oop_java2.quan_li_nhan_su.service.impl;

import oop_java2.quan_li_nhan_su.models.nhanVien;
import oop_java2.quan_li_nhan_su.service.impl.IService.nhanVienService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nhanVienImpl implements nhanVienService {
    static List<nhanVien> nhanVienList = new ArrayList<>();

    @Override
    public void addNhanVien() {
//        String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên nhân viên cần thêm mới:");
        String hoten = scanner.nextLine();
        System.out.println("Nhập năm sinh nhân viên cần thêm mới");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giới tính nhân viên cần thêm mới");
        String gioiTinh = scanner.nextLine();
        System.out.println("Nhập địa chỉ nhân viên cần thêm mới");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập công việc nhân viên cần thêm mới");
        String congViec = scanner.nextLine();
        nhanVien nhanVien = new nhanVien(hoten, namSinh, gioiTinh, diaChi, congViec);
        nhanVienList.add(nhanVien);
    }

    @Override
    public void searchNhanVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần tìm");
        String tenTimKiem = scanner.nextLine();
        for (int i = 0; i < nhanVienList.size(); i++) {
            if (nhanVienList.get(i).getHoTen().equals(tenTimKiem))

            System.out.println("Đã tìm kiếm thành công");
            System.out.println(nhanVienList.get(i));
            break;

        }
    }

    @Override
    public void arrangeNhanVien() {
        nhanVienList.sort(nhanVien::compareTo);
        for (nhanVien nhanVien : nhanVienList
        ) {
            System.out.println(nhanVien);
        }
    }

    @Override
    public void displayNhanVien() {
        for (nhanVien nhanVien: nhanVienList
             ) {
            System.out.println(nhanVien);
        }
    }
}
