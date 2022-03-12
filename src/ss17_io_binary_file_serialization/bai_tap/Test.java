package ss17_io_binary_file_serialization.bai_tap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void writeToFile(String path, List<Product> productList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static List<Product> readToFile(String path) {
        List<Product> productList = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return productList;
    }
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Thuốc lá", "SaiGon", 15000));
        productList.add(new Product(2, "Bánh", "Chocopie", 25000));
        productList.add(new Product(3, "Nước", "Bò húc", 15000));
        productList.add(new Product(4, "Sữa chua", "Vinamilk", 16000));
        writeToFile("D:\\CodeGym\\module_2\\src\\ss17_io_binary_file_serialization\\bai_tap\\product.txt", productList);
        List<Product> productListOne = readToFile("D:\\CodeGym\\module_2\\src\\ss17_io_binary_file_serialization\\bai_tap\\product.txt");

        for (Product product : productListOne) {
            System.out.println(product);
        }
        System.out.println("Nhập Tên sản phẩm bạn muốn tìm kiếm");
        Scanner input = new Scanner(System.in);
        String nameProducts = input.nextLine();
        for (int i =0;i< productList.size();i++){
            if(nameProducts.equals(productList.get(i).getNameProduct())){
                System.out.println(productList.get(i));
            }
        }

    }
}
