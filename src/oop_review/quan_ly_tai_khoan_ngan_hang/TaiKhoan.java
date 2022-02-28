package oop_review.quan_ly_tai_khoan_ngan_hang;

public class TaiKhoan {
    long soTaiKhoan;
    String tenTaiKhoan;
    double soTien;

    public TaiKhoan() {
    }

    public TaiKhoan(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;

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

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTien=" + soTien +
                '}';
    }
    
}
