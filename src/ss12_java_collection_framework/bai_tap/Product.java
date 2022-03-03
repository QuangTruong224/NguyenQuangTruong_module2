package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int id;
    private String ten;
    private int gia;

    public Product() {
    }

    public Product(int id, String ten, int gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getGia() - o.getGia();
    }
}
