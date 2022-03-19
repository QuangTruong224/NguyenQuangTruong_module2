package case_study.service.impl;

import case_study.models.Customer;
import case_study.read_write.FileWriteReader;
import case_study.service.CustomerService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    private static final String REGEX_AGE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    private static final String REGEX_GENGER = "^([n|N][a|A][m|M])|([n|N][u|U])$";
    private static final String REGEX_CMND = "^\\d{9}$";
    private static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    private static final String REGEX_EMAIL = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String REGEX_PAYMENT = "^[1-9]+$";

    public Scanner scanner = new Scanner(System.in);

    public CustomerServiceImpl(int id,
                              String name,
                              String dayOfBirth,
                              String gender,
                              String soCmnd,
                              String phoneNumber,
                              String email,
                              String typeOfCustomer,
                              String address) {
        super(id, name, dayOfBirth, gender, soCmnd, phoneNumber, email, typeOfCustomer, address);
    }

    public CustomerServiceImpl(String typeOfCustomer, String address) {
        super(typeOfCustomer, address);
    }

    public CustomerServiceImpl() {
    }

    public static List<Customer> customerList = new ArrayList<Customer>();

    static {
        Customer employee = new Customer(1, "Trường", "2000", "nam", "0231321", "013213", "abc@gmail.com", "Silver", "đà nẵng");
        Customer employee1 = new Customer(1, "Khoa", "1988", "nam", "0231321", "013213", "abc@gmail.com", "Silver", "đà nẵng");
        Customer employee2 = new Customer(1, "Hậu", "1999", "nữ", "0231321", "013213", "abc@gmail.com", "Silver", "đà nẵng");
        customerList.add(employee);
        customerList.add(employee1);
        customerList.add(employee2);
    }

    @Override
    public void displayListService() {
        customerList = read("D:\\CodeGym\\module_2\\src\\case_study\\data\\customer.csv");
        for (int i = 0; i < customerList.size(); i++) {
            customerList.get(i).setId(i + 1);
            System.out.println(customerList.get(i));
        }

    }

    @Override
    public void addNew() {
        System.out.print("Mời bạn nhập mã nhân viên:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Mời bạn tên khách hàng:");
        String name = scanner.nextLine();

        System.out.print("Mời bạn ngày sinh khách hàng:");
        String dayOfBirth = scanner.nextLine();

        System.out.print("Mời bạn giới tính khách hàng:");
        String gender = scanner.nextLine();

        System.out.print("Mời bạn nhập số CMND khách hàng:");
        String soCmnd = scanner.nextLine();

        System.out.print("Mời bạn nhập số điện thoại khách hàng:");
        String phoneNumber = scanner.nextLine();

        System.out.print("Mời bạn nhập email khách hàng:");
        String email = scanner.nextLine();

        System.out.print("Mời bạn nhập loại customer khách hàng:");
        String typeOfCustomer = scanner.nextLine();

        System.out.print("Mời bạn nhập lương nhân viên:");
        String address = scanner.nextLine();
        CustomerService newCustomer = new CustomerServiceImpl(id, name, dayOfBirth, gender, soCmnd, phoneNumber, email, typeOfCustomer, address);
        newCustomer.addNew();
        write("D:\\CodeGym\\module_2\\src\\case_study\\data\\customer.csv");

    }

    @Override
    public void edit() {
        System.out.println("Mời bạn lựa chọn mã ID nhân viên cần chỉnh sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (idEdit == customerList.get(i).getId()) {

                System.out.print("Mời bạn tên khách hàng:");
                String name = scanner.nextLine();

                System.out.print("Mời bạn ngày sinh khách hàng:");
                String dayOfBirth = scanner.nextLine();

                System.out.print("Mời bạn giới tính khách hàng:");
                String gender = scanner.nextLine();

                System.out.print("Mời bạn nhập số CMND khách hàng:");
                String soCmnd = scanner.nextLine();

                System.out.print("Mời bạn nhập số điện thoại khách hàng:");
                String phoneNumber = scanner.nextLine();

                System.out.print("Mời bạn nhập email khách hàng:");
                String email = scanner.nextLine();

                System.out.print("Mời bạn nhập loại customer khách hàng:");
                String typeOfCustomer = scanner.nextLine();

                System.out.print("Mời bạn nhập lương nhân viên:");
                String address = scanner.nextLine();
                int payment = Integer.parseInt((scanner.nextLine()));
                customerList.get(i).setName(name);
                customerList.get(i).setDayOfBirth(dayOfBirth);
                customerList.get(i).setGender(gender);
                customerList.get(i).setSoCmnd(soCmnd);
                customerList.get(i).setPhoneNumber(phoneNumber);
                customerList.get(i).setEmail(email);
                customerList.get(i).setTypeOfCustomer(typeOfCustomer);
                customerList.get(i).setAddress(address);

                break;

            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Mời bạn lựa chọn mã ID khách hàn cần xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (idDelete == customerList.get(i).getId()) {
                customerList.remove(i);
            }
        }

    }

    public static void write(String link) {
        File file = new File(link);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customerList) {
                bufferedWriter.write(
                        customer.getId() + "," +
                                customer.getName() + "," +
                                customer.getDayOfBirth() + "," +
                                customer.getGender() + "," +
                                customer.getSoCmnd() + "," +
                                customer.getPhoneNumber() + "," +
                                customer.getEmail() + "," +
                                customer.getTypeOfCustomer() + "," +
                                customer.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Customer> read(String link) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = null;
        String[] temp = null;
        String line = null;
        File file = new File(link);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
        try {

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
