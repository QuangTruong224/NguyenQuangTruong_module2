package oop_review.quan_ly_tai_khoan_ngan_hang;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double napTien;
        double rutTien;
        double soTienConLaiKhiRut;
        double soTienDaoHan;
        TaiKhoan taiKhoan=new TaiKhoan(1016709193, "Vietcombank");
        System.out.println(taiKhoan.getSoTien());

        TaiKhoan taiKhoan1=new TaiKhoan();
        taiKhoan1.setTenTaiKhoan("NGUYEN QUANG TRUONG");
        taiKhoan1.setSoTaiKhoan(10167013);
        taiKhoan1.setSoTien(500000);
        do {
            System.out.println("Nhập số tiền bạn muốn nạp vào tài khoản:");
            napTien=input.nextDouble();
            if (napTien>0){
                taiKhoan1.napTien(napTien);
            } else {
                System.out.println("Số tiền bạn nạp phải lớn hơn 0VND");
            }

        } while (napTien<0);


        do {
            System.out.println("Nhập số tiền muốn rút:");
            rutTien = input.nextDouble();
            soTienConLaiKhiRut=taiKhoan1.rutTien(rutTien);
            if (soTienConLaiKhiRut<0){
                System.out.println("Số tiền trong tài khoản không đủ");
            } else {
                System.out.println("Tiền còn lại trong tài khoản : " +soTienConLaiKhiRut);
            }

        } while (soTienConLaiKhiRut==-1);

        soTienDaoHan=taiKhoan1.daoHan();
        System.out.println("Số tiền còn lại sau khi hết hạn: " + soTienDaoHan);
        System.out.println(taiKhoan1.toString());

    }
}
