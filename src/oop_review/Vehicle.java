package oop_review;

public class Vehicle {
    int phanPhoi;
    int giaXe;

    public Vehicle() {
    }

    public Vehicle(int phanPhoi, int giaXe) {
        this.phanPhoi = phanPhoi;
        this.giaXe = giaXe;
    }

    public int getPhanPhoi() {
        return phanPhoi;
    }

    public void setPhanPhoi(int phanPhoi) {
        this.phanPhoi = phanPhoi;
    }

    public int getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(int giaXe) {
        this.giaXe = giaXe;
    }

    public double thueDuoi100cc() {
        return 0.01;
    }

    public double thueDuoi200cc() {
        return 0.03;
    }

    public double thueTren200cc() {
        return 0.05;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "phanPhoi=" + phanPhoi +
                ", giaXe=" + giaXe +
                '}';
    }

}
