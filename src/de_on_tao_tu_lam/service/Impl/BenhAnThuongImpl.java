package de_on_tao_tu_lam.service.Impl;

import de_on_tao_tu_lam.models.BenhAnThuong;
import de_on_tao_tu_lam.models.BenhAnVip;
import de_on_tao_tu_lam.service.BenhAnThuongService;
import oop_review.phuong_tien.controller.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongImpl implements BenhAnThuongService {
    static List<BenhAnThuong> benhAnThuongList = new ArrayList<>();

    static {
        benhAnThuongList = readerBenhAnThuong();
    }

    public void write() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_on_tao_tu_lam\\data\\benhanthuong.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhAnThuong benhAnThuong : benhAnThuongList) {
                bufferedWriter.write(benhAnThuong.getSoThuTu() + "," + benhAnThuong.getMaBenhAn() + "," +
                        benhAnThuong.getTenBenhNhan() + "," + benhAnThuong.getNgayNhapVien() + "," +
                        benhAnThuong.getNgayRaVien() + "," + benhAnThuong.getLyDoNhapVien() + "," +
                        benhAnThuong.getPhiNamVien());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static List<BenhAnThuong> readerBenhAnThuong() {
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_on_tao_tu_lam\\data\\benhanthuong.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                BenhAnThuong benhAnThuong = new BenhAnThuong(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], Integer.parseInt(temp[6]));
                benhAnThuongList.add(benhAnThuong);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return benhAnThuongList;

    }


    @Override
    public void addBenhAnThuong() {
//        int soThuTu, String maBenhAn, String tenBenhNhan,
//        String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm số thứ tự mới");
        int soThuTu = Integer.parseInt(scanner.nextLine());
        System.out.println("Thêm bã bệnh án mới");
        String maBenhAn = scanner.nextLine();
        System.out.println("Thêm tên bệnh nhân mới");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Thêm mới ngày nhập viện");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Thêm mới ngày ra viện");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Thêm lý do nhập viện mới");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("Thêm mới phí nằm viện");
        int phiNamVien = Integer.parseInt(scanner.nextLine());
        BenhAnThuong benhAnThuong = new BenhAnThuong(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
        benhAnThuongList.add(benhAnThuong);
        write();
    }

    @Override
    public void deleteBenhAnThuong() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã bệnh án cần xóa");
        String xoaBenhAn = scanner.nextLine();
        for (int i = 0; i < benhAnThuongList.size(); i++) {
            System.out.println(benhAnThuongList.get(i).getMaBenhAn());
            if (benhAnThuongList.get(i).getMaBenhAn().equals(xoaBenhAn)) {
                check = true;
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        benhAnThuongList.remove(i);
                        System.out.println("Đã xóa rồi nhé!");
                        break;
                    case 2:
                        Menu.displayMenu();
                        break;
                }
            }
        }
        write();
    }

    @Override
    public void displayBenhAnThuong() {
        for (BenhAnThuong benhAnThuong : benhAnThuongList) {
            System.out.println(benhAnThuong);
        }
    }
}