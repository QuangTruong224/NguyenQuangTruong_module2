package de_on_tao_tu_lam.models;

public class BenhAnVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public BenhAnVip() {
    }

    public BenhAnVip(String loaiVip, String thoiHanVip) {
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public BenhAnVip(int soThuTu, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(soThuTu, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "soThuTu=" + getSoThuTu() +
                ", maBenhAn='" + getMaBenhAn() + '\'' +
                ", tenBenhNhan='" + getTenBenhNhan()
                + '\'' +
                ", ngayNhapVien='" + getNgayNhapVien() + '\'' +
                ", ngayRaVien='" + getNgayRaVien() + '\'' +
                ", lyDoNhapVien='" + getLyDoNhapVien() + '\'' +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                "} " ;
    }
}
