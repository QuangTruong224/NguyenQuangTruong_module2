package de_thi_c10.models;

public class XuatKhau extends SanPham {
    private double giaXuatKhau;
    private String quocGia;

    public XuatKhau() {
    }

    public XuatKhau(double giaXuatKhau, String quocGia) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
    }

    public XuatKhau(int id, String maSanPham, String tenSanPham, double giaBan, String soLuong, String nhaSanXuat, double giaXuatKhau, String quocGia) {
        super(id, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "XuatKhau{" +
                "id=" + getId() +
                ", maSanPham='" + getMaSanPham() + '\'' +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong='" + getSoLuong() + '\'' +
                ", nhaSanXuat='" + getNhaSanXuat() +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
