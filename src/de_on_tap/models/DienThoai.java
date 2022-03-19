package de_on_tap.models;

public abstract class DienThoai {
    private  int id;
    private String tenDienThoai;
    private int giaBan;
    private int soLuong;

    public DienThoai() {
    }

    public DienThoai(int id, String tenDienThoai, int giaBan, int soLuong) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                '}';
    }
}
