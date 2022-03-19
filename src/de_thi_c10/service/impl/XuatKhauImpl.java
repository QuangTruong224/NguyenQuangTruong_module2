package de_thi_c10.service.impl;

import de_thi_c10.controller.Menu;
import de_thi_c10.models.XuatKhau;
import de_thi_c10.service.XuatKhauService;
import de_thi_c10.utils.RegexData;
import de_thi_c11.models.BenhAnThuong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XuatKhauImpl implements XuatKhauService {
    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";
//    static List<XuatKhau> xuatKhauList = new ArrayList<>();
//    static {
//        xuatKhauList = readerXuatKhau();
//    }

    public void write(List<XuatKhau> xuatKhauList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_thi_c10\\data\\xuatkhau.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XuatKhau xuatKhau : xuatKhauList) {
                bufferedWriter.write(xuatKhau.getId() + "," + xuatKhau.getMaSanPham() + "," +
                        xuatKhau.getTenSanPham() + "," + xuatKhau.getGiaBan() + "," +
                        xuatKhau.getSoLuong() + "," + xuatKhau.getNhaSanXuat() + "," +
                        xuatKhau.getGiaXuatKhau() + "," + xuatKhau.getQuocGia());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<XuatKhau> readerXuatKhau() {
        List<XuatKhau> xuatKhauList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_thi_c10\\data\\xuatkhau.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                XuatKhau xuatKhau = new XuatKhau(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]), temp[4], temp[5], Double.parseDouble(temp[6]), temp[7]);
                xuatKhauList.add(xuatKhau);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return xuatKhauList;

    }


    @Override
    public void addNew() {
        List<XuatKhau> xuatKhauList = readerXuatKhau();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Thêm id mới");
//        int id = Integer.parseInt(scanner.nextLine());
        int id;
        if (xuatKhauList.size() == 0) {
            id = 1;
        } else {
            id = xuatKhauList.get(xuatKhauList.size() - 1).getId() + 1;
        }
        System.out.println("Thêm mã sản phẩm mới");
        String maSanPham = scanner.nextLine();
        System.out.println("Thêm tên sản phẩm mới");
        String tenSanPham = scanner.nextLine();
        System.out.println("Thêm giá bán mới");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.println("Thêm số lượng mới");
        String soLuong = scanner.nextLine();
        System.out.println("Thêm nhà sản xuất mới");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Thêm giá xuất khẩu mới");
        double giaXuatKhau = Double.parseDouble(RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Nhập sai định dạng vui lòng nhập lại"));
        System.out.println("Nhập quốc gia cần thêm mới");
        String quocGia = scanner.nextLine();
        XuatKhau xuatKhau = new XuatKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, quocGia);
        xuatKhauList.add(xuatKhau);
        write(xuatKhauList, true);
    }

    @Override
    public void delete() {
        display();

        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần xóa");
        String xoaMaSanPham = scanner.nextLine();
        List<XuatKhau> xuatKhauList = readerXuatKhau();
        for (int i = 0; i < xuatKhauList.size(); i++) {
            display();
            if (xuatKhauList.get(i).getMaSanPham().equals(xoaMaSanPham)) {
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xuatKhauList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
        write(xuatKhauList, false);
    }

    @Override
    public void display() {
        List<XuatKhau> xuatKhauList = readerXuatKhau();
        for (XuatKhau xuatKhau : xuatKhauList
        ) {
            System.out.println(xuatKhau);
        }
    }

    @Override
    public void search() {
        List<XuatKhau> xuatKhauList = readerXuatKhau();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần tìm");
        String maSanPham = scanner.nextLine();
        for (int i = 0; i < xuatKhauList.size(); i++) {
            if (xuatKhauList.get(i).getMaSanPham().equals(maSanPham)) {
                xuatKhauList.contains(i);
                System.out.println("Đã tìm kiếm thành công");
                System.out.println(xuatKhauList.get(i));
                break;
            }
        }
    }

}

