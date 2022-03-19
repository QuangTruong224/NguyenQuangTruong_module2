package de_on_tap.service.impl;

import de_on_tap.models.DienThoaiChinhHang;
import de_on_tap.models.DienThoaiXachTay;
import de_on_tap.service.DienThoaiChinhHangService;
import de_on_tap.utils.RegexData;
import de_thi_c10.controller.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangServiceImpl implements DienThoaiChinhHangService {
    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";

    public void write(List<DienThoaiChinhHang> dienThoaiChinhHangList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_on_tap\\data\\dienthoaichinhhang.csv", append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
                bufferedWriter.write(dienThoaiChinhHang.getId() + "," + dienThoaiChinhHang.getTenDienThoai() + "," +
                        dienThoaiChinhHang.getGiaBan() + "," + dienThoaiChinhHang.getSoLuong() + "," +
                        dienThoaiChinhHang.getThoiGianBaoHanh() + "," + dienThoaiChinhHang.getPhamViBaoHanh());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<DienThoaiChinhHang> readerDienThoaiChinhHang() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_on_tap\\data\\dienthoaichinhhang.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5]);
                dienThoaiChinhHangList.add(dienThoaiChinhHang);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return dienThoaiChinhHangList;
    }

    @Override
    public void addNew() {
//        int id, String tenDienThoai, int giaBan, int soLuong,
//        String thoiGianBaoHanh, String phamViBaoHanh
        List<DienThoaiChinhHang> dienThoaiChinhHangList = readerDienThoaiChinhHang();
        Scanner scanner = new Scanner(System.in);
        int id;
        if (dienThoaiChinhHangList.size() == 0) {
            id = 1;
        } else {
            id = dienThoaiChinhHangList.get(dienThoaiChinhHangList.size() - 1).getId() + 1;
        }
//        System.out.println("Thêm tên điện thoại mới");
//        String tenDienThoai = scanner.nextLine();
        String tenDienThoai;
        while (true) {
            System.out.println("Thêm tên điện thoại mới");
            tenDienThoai = scanner.nextLine();
            if (tenDienThoai.trim().equals("")) {
                System.out.println("Nhập lại");
            } else {
                break;
            }
        }
//        System.out.println("Thêm giá bán mới");
//        int giaBan = Integer.parseInt(RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc phải nhập số dương"));
        int giaBan;
        do {
            try {
                System.out.println("Thêm giá bán mới");
                giaBan = Integer.parseInt(de_on_tap.utils.RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc nhập số dương"));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
        } while (true);
//        System.out.println("Thêm số lượng mới");
//        int soLuong = Integer.parseInt(RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc phải nhập số dương"));
        int soLuong;
        do {
            try {
                System.out.println("Thêm số lượng mới");
                soLuong = Integer.parseInt(RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc nhập số dương"));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
        } while (true);
//        System.out.println("Thêm thời gian bảo hành");
//        String thoiGianBaoHanh = scanner.nextLine();
        String thoiGianBaoHanh;
        while (true) {
            System.out.println("thêm thời gian bảo hành");
            thoiGianBaoHanh = RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc nhập số dương");
            if (tenDienThoai.trim().equals("")) {
                System.out.println("Nhập lại");
            } else {
                break;
            }
        }
        System.out.println("Chọn phạm vi bảo hành");
        System.out.println("1.Quốc tế");
        System.out.println("2.Toàn quốc");
        ;
        String baoHanh = " ";
        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(" vui lòng nhập lại ");
        }
        switch (choose) {
            case 1:
                baoHanh = "Toàn quốc";
                break;
            case 2:
                baoHanh = "Quốc tế";
                break;
        }
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong, thoiGianBaoHanh, baoHanh);
        List<DienThoaiChinhHang> dienThoaiChinhHangList2 = new ArrayList<>();
        dienThoaiChinhHangList2.add(dienThoaiChinhHang);
        write(dienThoaiChinhHangList2, true);
    }

    @Override
    public void delete() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        displayDT();
            System.out.println("Nhập ID cần xóa");
            int xoaID = Integer.parseInt(scanner.nextLine());
            List<DienThoaiChinhHang> dienThoaiChinhHangList = readerDienThoaiChinhHang();
            for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {

                if (dienThoaiChinhHangList.get(i).getId() == xoaID) {
                    System.out.println("Bạn có muốn xóa không:");
                    System.out.println("1.Có");
                    System.out.println("2.Không");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            dienThoaiChinhHangList.remove(i);
                            System.out.println("Đã xóa rồi nhé!");
                            break;
                        case 2:
                            Menu.displayMenu();
                            break;
                    }
                }
            }
        write(dienThoaiChinhHangList,false);

    }



    @Override
    public void displayDT() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList = readerDienThoaiChinhHang();
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
            System.out.println(dienThoaiChinhHang);
        }
    }

    @Override
    public void searchDT() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList = readerDienThoaiChinhHang();
        Scanner scanner = new Scanner(System.in);
        displayDT();
        try {
            System.out.println("Nhập id cần tìm");
            int checkId = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {

                if (dienThoaiChinhHangList.get(i).getId() == checkId) {

                    System.out.println("Đã tìm kiếm thành công");
                    System.out.println(dienThoaiChinhHangList.get(i));
        }

            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập đúng ID muốn tìm");
        }

    }
}
