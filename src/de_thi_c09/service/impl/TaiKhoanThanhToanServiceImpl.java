package de_thi_c09.service.impl;

import de_on_tap.models.DienThoaiChinhHang;
import de_on_tap.utils.RegexData;
import de_thi_c09.models.TaiKhoanThanhToan;
import de_thi_c09.service.TaiKhoanThanhToanService;
import de_thi_c10.controller.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanServiceImpl implements TaiKhoanThanhToanService {
    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";

    public void write(List<TaiKhoanThanhToan> taiKhoanThanhToanList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_thi_c09\\data\\taikhoanthanhtoan.csv", append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
                bufferedWriter.write(taiKhoanThanhToan.getiD() + "," + taiKhoanThanhToan.getMaTaiKhoan() + "," +
                        taiKhoanThanhToan.getChuTaiKhoan() + "," + taiKhoanThanhToan.getNgayTaoTaiKhoan() + "," +
                        taiKhoanThanhToan.getSoThe() + "," + taiKhoanThanhToan.getSoTien());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<TaiKhoanThanhToan> readerTaiKhoanThanhToan() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_thi_c09\\data\\taikhoanthanhtoan.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(Integer.parseInt(temp[0]), temp[1],
                       temp[2], temp[3], temp[4], temp[5]);
                taiKhoanThanhToanList.add(taiKhoanThanhToan);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return taiKhoanThanhToanList;
    }

    @Override
    public void addNew() {
//        int iD, String maTaiKhoan, String chuTaiKhoan,
//        String ngayTaoTaiKhoan, String soThe, String soTien
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int iD;
        if (taiKhoanThanhToanList.size() == 0) {
            iD = 1;
        } else {
            iD = taiKhoanThanhToanList.get(taiKhoanThanhToanList.size() - 1).getiD() + 1;
            String maTaiKhoan;
            while (true) {
                System.out.println("Thêm mã tài khoản");
                maTaiKhoan = scanner.nextLine();
                ;
                if (maTaiKhoan.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            String chuTaiKhoan;
            while (true) {
                System.out.println("Thêm chủ tài khoản");
                chuTaiKhoan = scanner.nextLine();
                if (chuTaiKhoan.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            String ngayTaoTaiKhoan;
            while (true) {
                System.out.println("Nhập ngày tạo tài khoản");
                ngayTaoTaiKhoan = scanner.nextLine();
                if (ngayTaoTaiKhoan.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            String soThe;
            while (true) {
                System.out.println("Nhập số thẻ ");
                soThe = RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Phải nhập số dương");
                if (soThe.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            String soTien;
            while (true) {
                System.out.println("Nhập số tiền");
                soTien = RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Phải nhập số tiền lớn hơn 0");
                if (soTien.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(iD, maTaiKhoan, chuTaiKhoan, ngayTaoTaiKhoan, soThe, soTien);
            List<TaiKhoanThanhToan> taiKhoanThanhToanList1 = new ArrayList<>();
            taiKhoanThanhToanList1.add(taiKhoanThanhToan);
            write(taiKhoanThanhToanList1, true);
        }

    }

    @Override
    public void delete() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        display();
        System.out.println("Nhập mã tài khoản cần xóa");
        String xoaMaTaiKhoan = scanner.nextLine();
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = readerTaiKhoanThanhToan();
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {

            if (taiKhoanThanhToanList.get(i).getMaTaiKhoan().equals(xoaMaTaiKhoan)) {
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        taiKhoanThanhToanList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
        write(taiKhoanThanhToanList, false);

    }


    @Override
    public void display() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = readerTaiKhoanThanhToan();
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
            System.out.println(taiKhoanThanhToan);
        }
    }

    @Override
    public void search() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList=readerTaiKhoanThanhToan();
        Scanner scanner=new Scanner(System.in);
        display();
        try {
            System.out.println("Nhập mã tài khoản cần tìm");
            String checkMaTaiKhoan=scanner.nextLine();
            for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
                if (taiKhoanThanhToanList.get(i).getMaTaiKhoan().equals(checkMaTaiKhoan)) {
                    System.out.println("Đã tìm kiếm thành công");
                    System.out.println(taiKhoanThanhToanList.get(i));
                }
            }
        }catch(Exception e) {
            System.out.println("Vui lòng nhập lại");
        }

    }
}
