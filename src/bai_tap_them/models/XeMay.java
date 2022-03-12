package bai_tap_them.models;

public class XeMay extends PhuongTien {
    private String congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMayService{" +
                "bienKiemSoat='" + getBienKiemSoat() + '\'' +
                ", hangSanXuat='" + getHangSanXuat() + '\'' +
                ", namSanXuat=" + getNamSanXuat() +
                ", chuSoHuu='" + getChuSoHuu() + '\'' +
                "congSuat='" + congSuat + '\'' +
                "} " ;
    }
}
