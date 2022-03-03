package oop_java2.quan_li_nhan_su.models;

public class congNhan extends canBo implements Comparable<congNhan> {
    private String bacCap;

    public congNhan() {
    }

    public congNhan(String bacCap) {
        this.bacCap = bacCap;
    }

    public congNhan(String hoTen, int namSinh, String gioiTinh, String diaChi, String bacCap) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bacCap = bacCap;
    }

    public String getBacCap() {
        return bacCap;
    }

    public void setBacCap(String bacCap) {
        this.bacCap = bacCap;
    }

    @Override
    public String toString() {
        return "congNhan{"+
                "hoTen='" + getHoTen()+ '\'' +
                ", namSinh=" + getNamSinh() +
                ", gioiTinh='" + getGioiTinh() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "bacCap='" + bacCap + '\'' +
                '}';
    }

    @Override
    public int compareTo(congNhan o) {
        return this.getHoTen().compareTo(o.getHoTen());
    }
}
