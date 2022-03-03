package oop_java2.quan_li_nhan_su.models;

public class kySu extends canBo implements Comparable<kySu>{
    private String nganhDaoTao;

    public kySu() {
    }

    public kySu(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    public kySu(String hoTen, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "kySu{" +
                "hoTen='" + getHoTen()+ '\'' +
                ", namSinh=" + getNamSinh() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }

    @Override
    public int compareTo(kySu o) {
        return this.getHoTen().compareTo(o.getHoTen());
    }
}
