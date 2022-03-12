package de_thi_c11.service.Impl;

import de_thi_c11.models.BenhAnVip;
import de_thi_c11.service.BenhAnVipService;
import oop_review.phuong_tien.controller.Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipImpl implements BenhAnVipService {
  static   List<BenhAnVip> benhAnVipList=new ArrayList<>();
    static {
        benhAnVipList=readerBenhAnVip();
    }
    public void write(){
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_on_tao_tu_lam\\data\\benhanvip.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhAnVip benhAnVip : benhAnVipList){
                bufferedWriter.write(benhAnVip.getSoThuTu()+","+benhAnVip.getMaBenhAn()+","+
                benhAnVip.getTenBenhNhan()+","+benhAnVip.getNgayRaVien()+","+benhAnVip.getNgayNhapVien()+","+
                        benhAnVip.getLyDoNhapVien()+","+benhAnVip.getLoaiVip()+","+benhAnVip.getThoiHanVip());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
    public static  List<BenhAnVip> readerBenhAnVip() {
           try{ FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\de_on_tao_tu_lam\\data\\benhanvip.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                BenhAnVip benhAnVip = new BenhAnVip(Integer.parseInt(temp[0]),temp[1], temp[2], temp[3], temp[4],temp[5],temp[6],temp[7]);
                benhAnVipList.add(benhAnVip);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return benhAnVipList ;
}

    @Override
    public void addBenhAnVip() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Thêm số thứ tự mới");
        int soThuTu=Integer.parseInt(scanner.nextLine());
        System.out.println("Thêm bã bệnh án mới");
        String maBenhAn=scanner.nextLine();
        System.out.println("Thêm tên bệnh nhân mới");
        String tenBenhNhan=scanner.nextLine();
        System.out.println("Thêm mới ngày nhập viện");
        String ngayNhapVien=scanner.nextLine();
        System.out.println("Thêm mới ngày ra viện");
        String ngayRaVien=scanner.nextLine();
        System.out.println("Thêm lý do nhập viện mới");
        String lyDoNhapVien=scanner.nextLine();
        System.out.println("1. vip 1");
        System.out.println("2.  vip2");
        System.out.println("3. vip3 ");
        System.out.println("Thêm loại Vip mới");
        String loaiVip = " ";
        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(" vui lòng nhập lại nghe ");
        }
        switch (choose) {
            case 1:
                loaiVip = "vip1";
                break;
            case 2:
                loaiVip = "vip 2";
                break;
            case 3:
                loaiVip = "vip 3";
                break;
        }
        System.out.println("Thêm thời hạn Vip mới");
        String thoiHanVip=scanner.nextLine();
        BenhAnVip benhAnVip=new BenhAnVip(soThuTu,maBenhAn,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDoNhapVien,loaiVip,thoiHanVip);
       benhAnVipList.add(benhAnVip);
write();
    }

    @Override
    public void deleteBenhAnVip() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã bệnh án cần xóa");
        String xoaBenhAn = scanner.nextLine();
        for (int i = 0; i < benhAnVipList.size(); i++) {
            System.out.println(benhAnVipList.get(i).getMaBenhAn());
            if (benhAnVipList.get(i).getMaBenhAn().equals(xoaBenhAn)) {
                check = true;
                System.out.println("Bạn có muốn xóa mã bệnh án:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        benhAnVipList.remove(i);
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
    public void displayBenhAnVip() {
            for (BenhAnVip benhAnVip:benhAnVipList
                 ) {
                System.out.println(benhAnVip);
            }
    }
}
