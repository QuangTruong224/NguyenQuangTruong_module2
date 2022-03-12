package bai_tap_them.service.impl;
import bai_tap_them.controller.Menu;
import bai_tap_them.models.XeTai;
import bai_tap_them.service.XeTaiService;
import bai_tap_them.utils.RegexData;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiImpl implements XeTaiService {
    static List<XeTai> xeTaiList = new ArrayList<>();
    static {
        xeTaiList = readerXeTai();
    }

    public void write() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\CodeGym\\module_2\\src\\bai_tap_them\\data\\xetai.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (XeTai xeTai: xeTaiList) {
                bufferedWriter.write(xeTai.getBienKiemSoat() + "," + xeTai.getHangSanXuat() + "," +
                        xeTai.getNamSanXuat() + "," + xeTai.getChuSoHuu() + "," +
                        xeTai.getTrongTai());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static List<XeTai> readerXeTai() {
        try {
            FileReader fileReader = new FileReader(new File("D:\\CodeGym\\module_2\\src\\bai_tap_them\\data\\xetai.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                XeTai xeTai = new XeTai(temp[0],temp[1],(temp[2]),temp[3],temp[4]);
                xeTaiList.add(xeTai);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return xeTaiList;

    }

    @Override
    public void addXeTai() {
//        String bienKiemSoat, String hangSanXuat,
//        int namSanXuat, String chuSoHuu, String trongTai
        Scanner scanner = new Scanner(System.in);
        String bienKiemSoat = RegexData.checkBienSoXeTai();
        System.out.println("Hãng sản xuất:");
        String hangXanSuat = scanner.nextLine();
        System.out.println("Năm sản xuất :");
        String namSanXuat = scanner.nextLine();
        System.out.println("CHủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Trọng tải xe :");
        String trongTai = scanner.nextLine();
        XeTai xeTai = new XeTai(bienKiemSoat, hangXanSuat, namSanXuat, chuSoHuu, trongTai);
        xeTaiList.add(xeTai);
        write();
    }

    @Override
    public void deleteXeTai() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        System.out.println("Nhập biển số cần xóa:");
        String xoaBienSo = scanner.nextLine();
        for (int i = 0; i < xeTaiList.size(); i++) {
            System.out.println(xeTaiList.get(i).getBienKiemSoat());
            if (xeTaiList.get(i).getBienKiemSoat().equals(xoaBienSo)) {
                check = true;
                System.out.println("Bạn có muốn xóa chứ?");
                System.out.println("1.Có chứ");
                System.out.println("2.Không chứ");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        xeTaiList.remove(i);
                        System.out.println("Đã xóa cho bạn!");
                        break;
                    case 2:
                        Menu.displayMenu();
                }
            }


        }write();
    }

    @Override
    public void displayXeTai() {
        for (XeTai xeTai : xeTaiList
        ) {
            System.out.println(xeTai);

        }
    }
}
