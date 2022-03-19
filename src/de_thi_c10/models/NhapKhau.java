package de_thi_c10.models;

public class NhapKhau extends SanPham {
    private double giaNhapKhau;
    private String tinhThanhNhap;
    private int thueNhapKhau;

    public NhapKhau() {
    }

    public NhapKhau(double giaNhapKhau, String tinhThanhNhap, int thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public NhapKhau(int id, String maSanPham, String tenSanPham, double giaBan, String soLuong, String nhaSanXuat, double giaNhapKhau, String tinhThanhNhap, int thueNhapKhau) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public int getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(int thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "NhapKhau{" +
                "id=" + getId() +
                ", maSanPham='" + getMaSanPham() + '\'' +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", giaBan=' " + getGiaBan() +
                ", soLuong='" + getSoLuong() + '\'' +
                ", nhaSanXuat='" + getNhaSanXuat() + '\'' +
                ", giaNhapKhau=' " + giaNhapKhau +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=' " + thueNhapKhau +
                '}';
    }
}
