package bai_tap_them.models;

public class Oto extends PhuongTien {
    private String loaiXe;
    private int soChoNgoi;
    private String kieuXe;

    public Oto() {
    }

    public Oto(String loaiXe, int soChoNgoi, String kieuXe) {
        this.loaiXe = loaiXe;
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Oto(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, String loaiXe, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.loaiXe = loaiXe;
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Oto{" + getBienKiemSoat() + '\'' +
                ", hangSanXuat='" + getHangSanXuat() + '\'' +
                ", namSanXuat=" + getNamSanXuat() +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                "loaiXe='" + loaiXe + '\'' +
                ", soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
