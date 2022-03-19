package de_thi_c10.service.impl;

import de_thi_c10.controller.Menu;
import de_thi_c10.models.NhapKhau;
import de_thi_c10.models.XuatKhau;
import de_thi_c10.service.NhapKhauService;
import de_thi_c10.utils.RegexData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhapKhauImpl implements NhapKhauService {
//    static List<NhapKhau> nhapKhauList = new ArrayList<>();
    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";
//    static {
//       nhapKhauList = readerNhapKhau();
//    }

    public void write(List<NhapKhau> nhapKhauList,boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_thi_c10\\data\\nhapkhau.csv",append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (NhapKhau nhapKhau:nhapKhauList) {
                bufferedWriter.write(nhapKhau.getId() + "," + nhapKhau.getMaSanPham() + "," +
                        nhapKhau.getTenSanPham() + "," + nhapKhau.getGiaBan() + "," +
                        nhapKhau.getSoLuong() + "," + nhapKhau.getNhaSanXuat() + "," +
                        nhapKhau.getGiaNhapKhau() + "," + nhapKhau.getTinhThanhNhap()+ "," + nhapKhau.getThueNhapKhau());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public static List<NhapKhau> readerNhapKhau() {
        List<NhapKhau> nhapKhauList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_thi_c10\\data\\nhapkhau.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                NhapKhau nhapKhau = new NhapKhau(Integer.parseInt(temp[0]),temp[1],temp[2],Double.parseDouble(temp[3]),temp[4],temp[5],Double.parseDouble(temp[6]),temp[7],Integer.parseInt(temp[8]));
                nhapKhauList.add(nhapKhau);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return nhapKhauList;

    }
    @Override
    public void addNew() {
//        int id, String maSanPham, String tenSanPham, double giaBan,
//        String soLuong, String nhaSanXuat, double giaNhapKhau,
//        String tinhThanhNhap, int thueNhapKhau
        List<NhapKhau> nhapKhauList1=readerNhapKhau();
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Thêm id mới");
        int id;
        if (nhapKhauList1.size()==0) {
            id=1;
        }else {
             id =nhapKhauList1.get(nhapKhauList1.size()-1).getId()+1;
        }

        System.out.println("Thêm mã sản phẩm mới");
        String maSanPham = scanner.nextLine();
        System.out.println("Thêm tên sản phẩm mới");
        String tenSanPham = scanner.nextLine();
        System.out.println("Thêm giá bán mới");
        double giaBan = Double.parseDouble(RegexData.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng mời nhập lại"));
        System.out.println("Thêm số lượng mới");
        String soLuong = RegexData.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng mời nhập lại");
        System.out.println("Thêm nhà sản xuất mới");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Thêm giá nhập khẩu mới");
        double giaNhapKhau = Double.parseDouble(RegexData.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng mời nhập lại"));
        System.out.println("Thêm tỉnh thành mới");
        String tinhThanhNhap = scanner.nextLine();
        System.out.println("Thêm thuế nhập khẩu mới");
        int thueNhapKhau =Integer.parseInt(RegexData.checkStr(scanner.nextLine(),REGEX_SO_DUONG,"Nhập sai định dạng mời nhập lại"));
        NhapKhau nhapKhau = new NhapKhau(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat, giaNhapKhau, tinhThanhNhap, thueNhapKhau);
        List<NhapKhau> nhapKhauList = new ArrayList<>();
        nhapKhauList.add(nhapKhau);
        write(nhapKhauList,true);
    }

    @Override
    public void delete() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần xóa");
        String xoaMaSanPham = scanner.nextLine();
        List<NhapKhau> nhapKhauList=readerNhapKhau();
        for (int i = 0; i < nhapKhauList.size(); i++) {
           display();
            if (nhapKhauList.get(i).getMaSanPham().equals(xoaMaSanPham)) {
                check = true;
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        nhapKhauList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
        write(nhapKhauList,false);
    }

    @Override
    public void display() {
        List<NhapKhau> nhapKhauList=readerNhapKhau();
        for (NhapKhau nhapKhau : nhapKhauList) {
            System.out.println(nhapKhau);
        }
    }

    @Override
    public void search() {
        List<NhapKhau> nhapKhauList=readerNhapKhau();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần tìm");
        String checkMaSanPham = scanner.nextLine();
        for (int i = 0; i < nhapKhauList.size(); i++) {
            if (nhapKhauList.get(i).getMaSanPham().contains((checkMaSanPham))) {

                System.out.println("Đã tìm kiếm thành công");
                System.out.println(nhapKhauList.get(i));
            }
        }

    }
}
