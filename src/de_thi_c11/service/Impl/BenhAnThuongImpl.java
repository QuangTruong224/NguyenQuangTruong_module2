package de_thi_c11.service.Impl;

import de_thi_c11.controller.Menu;
import de_thi_c11.models.BenhAnThuong;
import de_thi_c11.service.BenhAnThuongService;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongImpl implements BenhAnThuongService {
//    static List<BenhAnThuong> benhAnThuongList = new ArrayList<>();
//
//    static {
//        benhAnThuongList = readerBenhAnThuong();
//    }

    public void write(List<BenhAnThuong> benhAnThuongList,boolean append) {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\de_on_tao_tu_lam\\data\\benhanthuong.csv",append);
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
        List<BenhAnThuong> benhAnThuongList=new ArrayList<>();
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
        List<BenhAnThuong>benhAnThuongList=readerBenhAnThuong();
//        int soThuTu, String maBenhAn, String tenBenhNhan,
//        String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Thêm số thứ tự mới");
//        int soThuTu = Integer.parseInt(scanner.nextLine());
        int soThuTu;
        if (benhAnThuongList.size()==0) {
            soThuTu=1;
        }else {
            soThuTu=benhAnThuongList.get(benhAnThuongList.size()-1).getSoThuTu()+1;
        }
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
        write(benhAnThuongList,true);
    }

    @Override
    public void deleteBenhAnThuong() {
        List<BenhAnThuong> benhAnThuongList=readerBenhAnThuong();
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
        write(benhAnThuongList,false);
    }

    @Override
    public void displayBenhAnThuong() {
        List<BenhAnThuong> benhAnThuongList=readerBenhAnThuong();
        for (BenhAnThuong benhAnThuong : benhAnThuongList) {
            System.out.println(benhAnThuong);
        }
    }
}
