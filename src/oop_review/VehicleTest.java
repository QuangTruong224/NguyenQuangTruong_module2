package oop_review;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        boolean check=true;
        do {
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin");
            System.out.println("2.Xuất bảng kê khai tiền thuế của các xe");
            System.out.println("3.Thoát");
            Scanner scanner = new Scanner(System.in);
           int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    Vehicle vehicle1 = new Vehicle();
                    System.out.println("Nhập phân phối xe:");
                    vehicle1.setPhanPhoi(scanner.nextInt());
                    System.out.println("Nhập giá tiền mua :");
                    vehicle1.setGiaXe(scanner.nextInt());
                    System.out.println(vehicle1.toString());
                    break;
                case 2:
                    Vehicle vehicle2 = new Vehicle();
                    System.out.println("Nhập phân phối xe:");
                    vehicle2.setPhanPhoi(scanner.nextInt());
                    System.out.println("Nhập giá tiền mua:");
                    vehicle2.setGiaXe(scanner.nextInt());
                    System.out.println("Thuế trước bạ:");
                    if (vehicle2.getPhanPhoi() > 200) {
                        System.out.println(vehicle2.giaXe* vehicle2.thueTren200cc());
                    } else if (vehicle2.getPhanPhoi() > 100) {
                        System.out.println(vehicle2.giaXe* vehicle2.thueDuoi200cc());
                    } else {
                        System.out.println(vehicle2.thueDuoi100cc()*vehicle2.giaXe);
                    }
                    break;
                default:
                    check=false;
                    System.out.println("Cám ơn bạn đã sử dụng dịch vụ");
                    break;
            }
        } while (check);
    }
}






