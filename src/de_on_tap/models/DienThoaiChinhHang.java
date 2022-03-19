package de_on_tap.models;

public class DienThoaiChinhHang extends DienThoai{
    private String thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang(int id, String tenDienThoai, int giaBan, int soLuong, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" +
                        "id=" + getId() +
                ", tenDienThoai='" + getTenDienThoai() + '\'' +
                ", giaBan=" + getGiaBan() +
                ", soLuong=" + getSoLuong() + '\'' +
                ", thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
}
