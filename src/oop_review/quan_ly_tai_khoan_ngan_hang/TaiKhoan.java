package oop_review.quan_ly_tai_khoan_ngan_hang;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TaiKhoan {
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien = 50;
    public final double LAISUAT = 0.035;
    public double napTien;
    public double rutTien;

    public TaiKhoan() {
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan, double soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public double napTien() {
    return getSoTien()+napTien;
    }
    public double rutTien() {
        return getSoTien();
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTien=" + soTien +
                '}';
    }

}
