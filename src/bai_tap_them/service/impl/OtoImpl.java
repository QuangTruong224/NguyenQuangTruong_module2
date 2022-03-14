package bai_tap_them.service.impl;

import bai_tap_them.controller.Menu;
import bai_tap_them.models.Oto;
import bai_tap_them.service.OtoService;
import bai_tap_them.utils.RegexData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoImpl implements OtoService {
    //    private static final String REGEX_BIENSO = "^\\d{2}[A]\\-\\d{3}\\.\\d{2}$";
    static List<Oto> otoList = new ArrayList<>();

    static {
        otoList = readerOto();
    }

    public void write() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\bai_tap_them\\data\\oto.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Oto oto : otoList) {
                bufferedWriter.write(oto.getBienKiemSoat() + "," + oto.getHangSanXuat() + "," +
                        oto.getNamSanXuat() + "," + oto.getChuSoHuu() + "," +
                        oto.getSoChoNgoi() + "," + oto.getKieuXe() + "," + oto.getLoaiXe());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static List<Oto> readerOto() {
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\bai_tap_them\\data\\oto.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Oto oto = new Oto(temp[0], temp[1], temp[2], temp[3], temp[4], Integer.parseInt(temp[5]), temp[6]);
                otoList.add(oto);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return otoList;

    }

    @Override
    public void addOto() {
        Scanner scanner = new Scanner(System.in);
//        String bienKiemSoat, String hangSanXuat, String namSanXuat,
//        String chuSoHuu, int soChoNgoi, String kieuXe

        System.out.println("1.Xe khách thì nhập biển B");
        System.out.println("2.Xe du lịch thì nhập biển A");
        String loaiXe = " ";
        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(" vui lòng nhập lại nghe ");
        }
        switch (choose) {
            case 1:
                loaiXe = "Xe khách";
                break;
            case 2:
                loaiXe = "Xe du lịch";
                break;
        }
        String bienKiemSoat = RegexData.checkBienSoOto();
        System.out.println("Hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Năm sản xuất:");
        String namSanXuat = scanner.nextLine();
        System.out.println("CHủ sỡ hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Số chỗ ngồi:");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Kiểu xe :");
        String kieuXe = scanner.nextLine();
        Oto oto = new Oto(loaiXe,bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        otoList.add(oto);
        write();
    }

    @Override
    public void deleteOto() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển số cần xóa:");
        String xoaBienSo = scanner.nextLine();
        for (int i = 0; i < otoList.size(); i++) {
            System.out.println(otoList.get(i).getBienKiemSoat());
            if (otoList.get(i).getBienKiemSoat().equals(xoaBienSo)) {
                check = true;
                System.out.println("Bạn có muốn xóa không:");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        otoList.remove(i);
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
    public void displayOto() {
        for (Oto oto : otoList) {
            System.out.println(oto);
        }

    }
}
