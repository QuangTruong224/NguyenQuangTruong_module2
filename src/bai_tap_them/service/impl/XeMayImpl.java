package bai_tap_them.service.impl;

import bai_tap_them.controller.Menu;
import bai_tap_them.models.XeMay;
import bai_tap_them.service.XeMayService;
import bai_tap_them.utils.RegexData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeMayImpl implements XeMayService {
    static List<XeMay> xeMayList=new ArrayList<>();
    static {
        xeMayList = readerXeMay();
    }

    public void write() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\bai_tap_them\\data\\semay.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeMay xeMay : xeMayList) {
                bufferedWriter.write(xeMay.getBienKiemSoat() + "," + xeMay.getHangSanXuat() + "," +
                        xeMay.getNamSanXuat() + "," + xeMay.getChuSoHuu() + "," +
                        xeMay.getCongSuat());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static List<XeMay> readerXeMay() {
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\bai_tap_them\\data\\semay.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                XeMay xeMay = new XeMay(temp[0],temp[1],(temp[2]),temp[3],temp[4]);
                xeMayList.add(xeMay);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return xeMayList;

    }
    @Override
    public void addXeMay() {
//        String bienKiemSoat, String hangSanXuat,
//        int namSanXuat, String chuSoHuu, String congSuat
        Scanner scanner = new Scanner(System.in);
        String bienKiemSoat = RegexData.checkBienSoXeMay();
        System.out.println("Hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Năm sản xuất:");
        String namSanXuat = scanner.nextLine();
        System.out.println("CHủ sỡ hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Công suất xe;");
        String congSuatXe=scanner.nextLine();
        XeMay xeMay=new XeMay(bienKiemSoat,hangSanXuat,namSanXuat,chuSoHuu,congSuatXe);
        xeMayList.add(xeMay);
        write();
    }

    @Override
    public void deleteXeMay() {
    boolean check=false;
    Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập biển số cần  xóa:");
        String xoaBienSo=scanner.nextLine();
        for (int i = 0; i < xeMayList.size(); i++) {
            System.out.println(xeMayList.get(i).getBienKiemSoat());
            if (xeMayList.get(i).getBienKiemSoat().equals(xoaBienSo)) {
                check=true;
                System.out.println("Bạn có muốn xóa hông nè:");
                System.out.println("1.Có xóa nè!");
                System.out.println("2.Hông bro!");
                int choice=Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xeMayList.remove(i);
                        System.out.println("Xóa rồi nè");
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
    public void displayXeMay() {
        for (XeMay xeMay:xeMayList) {
            System.out.println(xeMay);
        }
    }
}
