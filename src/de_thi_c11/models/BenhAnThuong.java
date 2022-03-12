package de_thi_c11.models;

public class BenhAnThuong extends BenhAn {
    private int phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "soThuTu=" + getSoThuTu() +
                ", maBenhAn='" + getMaBenhAn()+ '\'' +
                ", tenBenhNhan='" + getTenBenhNhan() + '\'' +
                ", ngayNhapVien='" + getNgayNhapVien() + '\'' +
                ", ngayRaVien='" + getNgayRaVien() + '\'' +
                ", lyDoNhapVien='" + getLyDoNhapVien() + '\'' +
                "phiNamVien=" + phiNamVien +
                "} ";
    }
}
