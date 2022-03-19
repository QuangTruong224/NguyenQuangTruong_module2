package de_thi_c09.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private int soTienGui;
    private String ngayGuiTien;
    private String laiXuat;
    private String kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int soTienGui, String ngayGuiTien, String laiXuat, String kiHan) {
        this.soTienGui = soTienGui;
        this.ngayGuiTien = ngayGuiTien;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int iD, String maTaiKhoan, String chuTaiKhoan, String ngayTaoTaiKhoan, int soTienGui, String ngayGuiTien, String laiXuat, String kiHan) {
        super(iD, maTaiKhoan, chuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGui = soTienGui;
        this.ngayGuiTien = ngayGuiTien;
        this.laiXuat = laiXuat;
        this.kiHan = kiHan;
    }

    public int getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(int soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getNgayGuiTien() {
        return ngayGuiTien;
    }

    public void setNgayGuiTien(String ngayGuiTien) {
        this.ngayGuiTien = ngayGuiTien;
    }

    public String getLaiXuat() {
        return laiXuat;
    }

    public void setLaiXuat(String laiXuat) {
        this.laiXuat = laiXuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{"  +
                "iD=" + getiD() +
                ", maTaiKhoan='" + getMaTaiKhoan() + '\'' +
                ", chuTaiKhoan='" + getChuTaiKhoan() + '\'' +
                ", ngayTaoTaiKhoan='" + getNgayTaoTaiKhoan() +
                "soTienGui=" + soTienGui +
                ", ngayGuiTien='" + ngayGuiTien + '\'' +
                ", laiXuat='" + laiXuat + '\'' +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
