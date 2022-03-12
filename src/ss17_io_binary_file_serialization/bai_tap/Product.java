package ss17_io_binary_file_serialization.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String productCompany;
    private double valueProduct;

    public Product(int idProduct, String nameProduct, String productCompany, double valueProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.productCompany = productCompany;
        this.valueProduct = valueProduct;
    }

    public Product() {
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getValueProduct() {
        return valueProduct;
    }

    public void setValueProduct(double valueProduct) {
        this.valueProduct = valueProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", valueProduct=" + valueProduct +
                '}';
    }
}
