package de_thi_c09.models;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private String soThe;
    private String soTien;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String soThe, String soTien) {
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public TaiKhoanThanhToan(int iD, String maTaiKhoan, String chuTaiKhoan, String ngayTaoTaiKhoan, String soThe, String soTien) {
        super(iD, maTaiKhoan, chuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{"  +
                "iD=" + getiD() +
                ", maTaiKhoan='" + getMaTaiKhoan() + '\'' +
                ", chuTaiKhoan='" + getChuTaiKhoan() + '\'' +
                ", ngayTaoTaiKhoan='" + getNgayTaoTaiKhoan() +
                "soThe='" + soThe + '\'' +
                ", soTien='" + soTien + '\'' +
                '}';
    }
}
