package de_on_tap.service.impl;

import de_on_tap.models.DienThoaiXachTay;
import de_on_tap.service.DienThoaiXachTayService;
import de_on_tap.utils.RegexData;
import de_thi_c10.controller.Menu;
import de_thi_c10.models.NhapKhau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayServiceImpl implements DienThoaiXachTayService {
    private static final String REGEX_SO_DUONG = "^[1-9]\\d*$";

    public void write(List<DienThoaiXachTay> dienThoaiXachTayList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_on_tap\\data\\dienthoaixachtay.csv", append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
                bufferedWriter.write(dienThoaiXachTay.getId() + "," + dienThoaiXachTay.getTenDienThoai() + "," +
                        dienThoaiXachTay.getGiaBan() + "," + dienThoaiXachTay.getSoLuong() + "," +
                        dienThoaiXachTay.getQuocGiaXachTay() + "," + dienThoaiXachTay.getTrangThai());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static List<DienThoaiXachTay> readerDienThoaiXachTay() {
        List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_on_tap\\data\\dienthoaixachtay.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]), Integer.parseInt(temp[3]), temp[4], temp[5]);
                dienThoaiXachTayList.add(dienThoaiXachTay);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return dienThoaiXachTayList;
    }

    @Override
    public void addNew() {
//        int id, String tenDienThoai, int giaBan,
//        int soLuong, String quocGiaXachTay, String trangThai
        List<DienThoaiXachTay> dienThoaiXachTayList = readerDienThoaiXachTay();
        Scanner scanner = new Scanner(System.in);
        int id;
        if (dienThoaiXachTayList.size() == 0) {
            id = 1;
        } else {
            id = dienThoaiXachTayList.get(dienThoaiXachTayList.size() - 1).getId() + 1;
        }
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
        int giaBan;
        do {
            try {
                System.out.println("Thêm giá bán mới");
                giaBan = Integer.parseInt(RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc nhập số dương"));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng");
            }
        } while (true);
//        System.out.println("Thêm số lượng mới");
//        int soLuong = Integer.parseInt(RegexData.checkStr(scanner.nextLine(), REGEX_SO_DUONG, "Bắt buộc nhập số dương"));
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
        String quocGiaXachtay;
        while (true) {
            System.out.println("Thêm quốc gia xách tay mới");
            quocGiaXachtay=scanner.nextLine();
            if (quocGiaXachtay.equals("Viet Nam")) {
                System.out.println("Quốc gia xách tay: không được là “Viet Nam”");

            } else if (quocGiaXachtay.trim().equals("")) {
                System.out.println("nhập lại");

            } else {
                break;
            }
        }
        System.out.println("Vui lòng chọn trạng thái điện thoại");
        System.out.println("1.Đã sửa chữa");
        System.out.println("2.Chưa sửa chữa");

        String trangThai = " ";
        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(" vui lòng nhập lại ");
        }
        switch (choose) {
            case 1:
                trangThai = "Đã sửa chữa";
                break;
            case 2:
                trangThai = "Chưa sửa chữa";
                break;
        }
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id,tenDienThoai,giaBan,soLuong,quocGiaXachtay,trangThai);
        List<DienThoaiXachTay> dienThoaiXachTayList2 = new ArrayList<>();
        dienThoaiXachTayList2.add(dienThoaiXachTay);
        write(dienThoaiXachTayList2, true);
    }

    @Override
    public void delete() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        displayDT();
        System.out.println("Nhập ID cần xóa");
        int xoaID = Integer.parseInt(scanner.nextLine());
        List<DienThoaiXachTay> dienThoaiXachTayList = readerDienThoaiXachTay();
        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {

            if (dienThoaiXachTayList.get(i).getId() == xoaID) {
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        dienThoaiXachTayList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
        write(dienThoaiXachTayList, false);
    }

    @Override
    public void displayDT() {
        List<DienThoaiXachTay> dienThoaiXachTayList = readerDienThoaiXachTay();
        for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
            System.out.println(dienThoaiXachTay);
        }
    }

    @Override
    public void searchDT() {
        List<DienThoaiXachTay> dienThoaiXachTayList = readerDienThoaiXachTay();
        Scanner scanner = new Scanner(System.in);
        displayDT();
        try {
            System.out.println("Nhập id cần tìm");
            int checkId = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < dienThoaiXachTayList.size(); i++) {

                if (dienThoaiXachTayList.get(i).getId() == checkId) {

                    System.out.println("Đã tìm kiếm thành công");
                    System.out.println(dienThoaiXachTayList.get(i));
        }

            }
        }catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập đúng ID cần tìm");
        }

    }
}
