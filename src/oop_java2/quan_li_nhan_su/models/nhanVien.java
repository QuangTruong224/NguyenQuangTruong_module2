package oop_java2.quan_li_nhan_su.models;

public class nhanVien extends canBo implements Comparable<nhanVien> {
    private String congViec;

    public nhanVien() {
    }

    public nhanVien(String congViec) {
        this.congViec = congViec;
    }

    public nhanVien(String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "nhanVien{" +
                "hoTen='" + getHoTen()+ '\'' +
                ", namSinh=" + getNamSinh() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "congViec='" + congViec + '\'' +
                '}';
    }

    @Override
    public int compareTo(nhanVien o) {
        return this.getHoTen().compareTo(o.getHoTen());
    }
}
