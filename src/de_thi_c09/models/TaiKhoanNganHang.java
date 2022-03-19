package de_thi_c09.models;

public  abstract class TaiKhoanNganHang {
    private  int iD;
    private String maTaiKhoan;
    private String chuTaiKhoan;
    private String ngayTaoTaiKhoan;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(int iD, String maTaiKhoan, String chuTaiKhoan, String ngayTaoTaiKhoan) {
        this.iD = iD;
        this.maTaiKhoan = maTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getChuTaiKhoan() {
        return chuTaiKhoan;
    }

    public void setChuTaiKhoan(String chuTaiKhoan) {
        this.chuTaiKhoan = chuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHang{" +
                "iD=" + iD +
                ", maTaiKhoan='" + maTaiKhoan + '\'' +
                ", chuTaiKhoan='" + chuTaiKhoan + '\'' +
                ", ngayTaoTaiKhoan='" + ngayTaoTaiKhoan + '\'' +
                '}';
    }
}
