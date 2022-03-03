package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements ProductService {
    static List<Product> productList = new ArrayList<>();

    @Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String ten = scanner.nextLine();
        System.out.println("Nhập giá tiền sản phẩm:");
        int gia = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, ten, gia);
        productList.add(product);
    }

    @Override
    public void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bạn muốn thay đổi đi nè:");
        int idChinhSua = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idChinhSua) {
                System.out.println("Nhập tên sản phẩm muốn thay đổi:");
                String ten = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm:");
                int gia = Integer.parseInt(scanner.nextLine());
                productList.get(i).setTen(ten);
                productList.get(i).setGia(gia);
                System.out.println("Đã sửa thành công~");
            }
        }

    }

    @Override
    public void deleteProduct() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần xóa nào");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == idDelete) {
                productList.remove(i);
                System.out.println("Đã xóa thành công");
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm cần tìm");
        String tenTimKiem = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getTen().equals(tenTimKiem)) {
                productList.contains(i);
                System.out.println("Đã tìm kiếm thành công");
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void increaseProduct() {
        productList.sort(Product::compareTo);
        for (Product product : productList)
            System.out.println(product);

    }

    @Override
    public void decreaseProduct() {
        DecreaseProduct decreaseProduct = new DecreaseProduct();
        Collections.sort(productList, decreaseProduct);
        for (Product product1 : productList) {
            System.out.println(product1);
        }
    }
}
