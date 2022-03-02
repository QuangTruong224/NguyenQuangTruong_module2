package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
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
        if (this.gia > o.getGia()) {
            return 1;
        }else if (this.gia<o.getGia()){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.gia>o2.getGia()){
            return -1;
        }else if (o1.gia<o2.getGia()){
            return 1;
        }else {
            return 0;
        }
    }

}
