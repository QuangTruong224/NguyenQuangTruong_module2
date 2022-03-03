package oop_java2.quan_li_nhan_su.models;

public abstract class canBo {
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;

    public canBo() {
    }

    public canBo(String hoTen, int namSinh, String gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "canBo{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
