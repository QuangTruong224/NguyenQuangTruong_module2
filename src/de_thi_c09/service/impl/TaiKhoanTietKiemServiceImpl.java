package de_thi_c09.service.impl;

import de_on_tap.utils.RegexData;
import de_thi_c09.models.TaiKhoanThanhToan;
import de_thi_c09.models.TaiKhoanTietKiem;
import de_thi_c09.service.TaiKhoanTietKiemService;
import de_thi_c10.controller.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemServiceImpl implements TaiKhoanTietKiemService {
    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";

    public void write(List<TaiKhoanTietKiem> taiKhoanTietKiemList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_thi_c09\\data\\taikhoantietkiem.csv", append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
                bufferedWriter.write(taiKhoanTietKiem.getiD() + "," + taiKhoanTietKiem.getMaTaiKhoan() + "," +
                        taiKhoanTietKiem.getChuTaiKhoan() + "," + taiKhoanTietKiem.getNgayTaoTaiKhoan() + "," +
                        taiKhoanTietKiem.getSoTienGui() + "," + taiKhoanTietKiem.getNgayGuiTien()
                        + "," + taiKhoanTietKiem.getLaiXuat() + "," + taiKhoanTietKiem.getKiHan());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<TaiKhoanTietKiem> readerTaiKhoanTietKiem() {
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_thi_c09\\data\\taikhoantietkiem.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(Integer.parseInt(temp[0]), temp[1],
                        temp[2], temp[3], Integer.parseInt(temp[4]), temp[5],temp[6],temp[7]);
                taiKhoanTietKiemList.add(taiKhoanTietKiem);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return taiKhoanTietKiemList;
    }

    @Override
    public void addNew() {
//        int iD, String maTaiKhoan, String chuTaiKhoan,
//        String ngayTaoTaiKhoan, String soThe, String soTien
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int iD;
        if (taiKhoanTietKiemList.size() == 0) {
            iD = 1;
        } else {
            iD = taiKhoanTietKiemList.get(taiKhoanTietKiemList.size() - 1).getiD() + 1;
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
            int soTienGui;
           do {
               try {
                   System.out.println("Nhập số tiền gửi");
                   soTienGui=Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Phải nhập số tiền lớn hơn 0đ"));
                   break;
               } catch (NumberFormatException e) {
                   System.out.println("Nhập sai");
               }
           }while (true);
            String ngayGuiTien;
            while (true) {
                System.out.println("Nhập ngày gửi tiền");
                ngayGuiTien=scanner.nextLine();
                if (ngayGuiTien.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            String laiXuat;
            while (true) {
                System.out.println("Nhập lãi xuất");
                laiXuat=scanner.nextLine();
                if (laiXuat.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            String kiHan;
            while (true) {
                System.out.println("Nhập kì hạn");
                kiHan=scanner.nextLine();
                if (kiHan.trim().equals("")) {
                    System.out.println("Nhập lại");
                } else {
                    break;
                }
            }
            TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(iD, maTaiKhoan, chuTaiKhoan, ngayTaoTaiKhoan,soTienGui,ngayGuiTien,laiXuat,kiHan);
            List<TaiKhoanTietKiem> taiKhoanTietKiemList1 = new ArrayList<>();
            taiKhoanTietKiemList1.add(taiKhoanTietKiem);
            write(taiKhoanTietKiemList1, true);
        }

    }

    @Override
    public void delete() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        display();
        System.out.println("Nhập mã tài khoản cần xóa");
        String xoaMaTaiKhoan = scanner.nextLine();
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = readerTaiKhoanTietKiem();
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {

            if (taiKhoanTietKiemList.get(i).getMaTaiKhoan().equals(xoaMaTaiKhoan)) {
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        taiKhoanTietKiemList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
        write(taiKhoanTietKiemList, false);

    }


    @Override
    public void display() {
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = readerTaiKhoanTietKiem();
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
            System.out.println(taiKhoanTietKiem);
        }
    }

    @Override
    public void search() {
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = readerTaiKhoanTietKiem();
        Scanner scanner = new Scanner(System.in);
        display();
        try {
            System.out.println("Nhập mã tài khoản cần tìm");
            String checkMaTaiKhoan = scanner.nextLine();
            for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
                if (taiKhoanTietKiemList.get(i).getMaTaiKhoan().equals(checkMaTaiKhoan)) {
                    System.out.println("Đã tìm kiếm thành công");
                    System.out.println(taiKhoanTietKiemList.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Vui lòng nhập lại");
        }

    }
}
