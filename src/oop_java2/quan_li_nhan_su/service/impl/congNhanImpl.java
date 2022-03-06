package oop_java2.quan_li_nhan_su.service.impl;

import oop_java2.quan_li_nhan_su.models.congNhan;
import oop_java2.quan_li_nhan_su.service.impl.IService.congNhanService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class congNhanImpl implements congNhanService {
    static List<congNhan> congNhanList=new ArrayList<>();
    @Override
    public void addCongNhan() {
//        String hoTen, int namSinh, String gioiTinh, String diaChi, String bacCap
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập họ tên công nhân cần thêm mới");
        String hoTen=scanner.nextLine();
        System.out.println("Nhập năm sinh công nhân cần thêm mới");
        int namSinh=Integer.parseInt(scanner.nextLine());
        System.out.println("NHập giới tính công nhân cần thêm mới");
        String gioiTinh=scanner.nextLine();
        System.out.println("NHập địa chỉ công nhân cần thêm mới");
        String diaChi=scanner.nextLine();
        System.out.println("Nhập cấp bậc công nhân cần thêm mới");
        String bacCap=scanner.nextLine();
        congNhan congNhan=new congNhan(hoTen,namSinh,gioiTinh,diaChi,bacCap);
        congNhanList.add(congNhan);
    }

    @Override
    public void searchCongNhan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên công nhân cần tìm");
        String tenTimKiem = scanner.nextLine();
        for (int i = 0; i < congNhanList.size(); i++) {
            if (congNhanList.get(i).getHoTen().equals(tenTimKiem)) {

                System.out.println("Đã tìm kiếm thành công");
                System.out.println(congNhanList.get(i));
                break;
            }

        }
    }

    @Override
    public void arrangeCongNhan() {
        congNhanList.sort(congNhan::compareTo);
        for (congNhan congNhan : congNhanList)
            System.out.println(congNhan);

    }

    @Override
    public void displayCongNhan() {
        for (congNhan congNhan : congNhanList) {
            System.out.println(congNhan);
        }
    }
}
