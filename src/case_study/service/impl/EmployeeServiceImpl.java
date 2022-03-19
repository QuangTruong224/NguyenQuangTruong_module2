package case_study.service.impl;

import case_study.models.Employee;
import case_study.service.EmployeeService;
import case_study.utils.RegexData;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    private static final String REGEX_AGE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    private static final String REGEX_GENGER = "^([n|N][a|A][m|M])|([n|N][u|U])$";
    private static final String REGEX_CMND = "^\\d{9}$";
    private static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{8})$";
    private static final String REGEX_EMAIL = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
    private static final String REGEX_PAYMENT = "^[1-9]+$";
    private int select;
    boolean check;


    public Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<Employee>();

    static {
        Employee employee = new Employee(1, "Trường", "2000", "nam", "0231321", "013213", "abc@gmail.com", "abc", "tạp vụ", 2121);
        employeeList.add(employee);

    }


    public EmployeeServiceImpl(int id,
                              String name,
                              String dayOfBirth,
                              String gender,
                              String soCmnd,
                              String phoneNumber,
                              String email,
                              String prof,
                              String level,
                              int payment) {
        super(id, name, dayOfBirth, gender, soCmnd, phoneNumber, email, prof, level, payment);
    }

    public EmployeeServiceImpl(String prof, String level, int payment) {
        super(prof, level, payment);
    }

    public EmployeeServiceImpl() {
    }

    @Override
    public void displayListService() {
        employeeList = read("D:\\CodeGym\\module_2\\src\\case_study\\data\\employee.csv");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {
        System.out.print("Mời bạn nhập mã nhân viên:");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Mời bạn tên nhân viên:");
        String name = scanner.nextLine();

        System.out.print("Mời bạn ngày sinh nhân viên:");
        //String dayOfBirth = scanner.nextLine();
        String dayOfBirth = RegexData.checkAge(scanner.nextLine(), REGEX_AGE);

        System.out.print("Mời bạn giới tính nhân viên:");
        //String gender = scanner.nextLine();
        String gender = RegexData.checkStr(scanner.nextLine(), REGEX_GENGER, "Mời nhập lại!");
        switch (gender.toLowerCase(Locale.ROOT)) {
            case "nam":
                gender = "Nam";
                break;
            case "nu":
                gender = "Nữ";
                break;
        }

        System.out.print("Mời bạn nhập số CMND nhân viên:");
        String soCMND = RegexData.checkStr(scanner.nextLine(), REGEX_CMND, "Mời nhập lại số CMND là một số có 9 chữ số!");

        System.out.print("Mời bạn nhập số điện thoại nhân viên:");
        String phoneNumber = RegexData.checkStr(scanner.nextLine(), REGEX_PHONE_NUMBER, "Mời nhập số điện thoại theo định dạng 84XXXXXXXX hoặc (03 || 05|| 07||08||09)XXXXXXXXX");

        System.out.print("Mời bạn nhập email nhân viên:");
        String enmail = RegexData.checkStr(scanner.nextLine(), REGEX_EMAIL, "Mời bạn nhập lại email");
        String prof = "";
        do {
            check = true;
            System.out.println("Mời bạn lựa chọn trình độ nhân viên" +
                    "\n 1: Trung cấp" +
                    "\n 2: Cao đẳng" +
                    "\n 3: Đại học" +
                    "\n 4: Sau đại học");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    prof = "Trung cấp";
                    check = false;
                    break;
                case 2:
                    prof = "Cao đẳng";
                    check = false;
                    break;
                case 3:
                    prof = "Đại học";
                    check = false;
                    break;
                case 4:
                    prof = "Sau đại học";
                    check = false;
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (check);
        String level = "";
        do {
            check = true;
            System.out.println("Mời bạn lựa chọn trình độ nhân viên" +
                    "\n 1: Lễ tân" +
                    "\n 2: Phục vụ" +
                    "\n 3: Chuyên viên" +
                    "\n 4: Giám sát" +
                    "\n 5: Quản lý" +
                    "\n 6: Giám đốc");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    level = "Lễ tân";
                    check = false;
                    break;
                case 2:
                    level = "Phục vụ";
                    check = false;
                    break;
                case 3:
                    level = "Chuyên viên";
                    check = false;
                    break;
                case 4:
                    level = "Giám sát";
                    check = false;
                    break;
                case 5:
                    level = "Quản lý";
                    check = false;
                    break;
                case 6:
                    level = "Giám đốc";
                    check = false;
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        } while (check);

        System.out.print("Mời bạn nhập lương nhân viên:");
//        int payment = Integer.parseInt((scanner.nextLine()));
        int payment = Integer.parseInt(RegexData.checkStr(scanner.nextLine(), REGEX_PAYMENT, "Lương của nhân viên là một số nguyên dương"));

        Employee employee = new Employee(id, name, dayOfBirth, gender, soCMND, phoneNumber, enmail, prof, level, payment);

        employeeList.add(employee);
        write("D:\\CodeGym\\module_2\\src\\case_study\\data\\employee.csv");
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
            for (Employee employee : employeeList) {
                bufferedWriter.write(
                        employee.getId() + "," +
                                employee.getName() + "," +
                                employee.getDayOfBirth() + "," +
                                employee.getGender() + "," +
                                employee.getSoCmnd() + "," +
                                employee.getPhoneNumber() + "," +
                                employee.getEmail() + "," +
                                employee.getProf() + "," +
                                employee.getLevel() + "," +
                                employee.getPayment());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Employee> read(String link) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = null;
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
                employee = new Employee(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8], Integer.parseInt(temp[9]));
                employeeList.add(employee);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }


    @Override
    public void edit() {
        System.out.println("Mời bạn lựa chọn mã ID nhân viên cần chỉnh sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (idEdit == employeeList.get(i).getId()) {

                System.out.print("Mời bạn tên nhân viên:");
                String name = scanner.nextLine();

                System.out.print("Mời bạn ngày sinh nhân viên:");
                String dayOfBirth = scanner.nextLine();

                System.out.print("Mời bạn giới tính nhân viên:");
                String gender = scanner.nextLine();

                System.out.print("Mời bạn nhập số CMND nhân viên:");
                String soCMND = scanner.nextLine();

                System.out.print("Mời bạn nhập số điện thoại nhân viên:");
                String phoneNumber = scanner.nextLine();

                System.out.print("Mời bạn nhập email nhân viên:");
                String enmail = scanner.nextLine();

                System.out.print("Mời bạn nhập trình độ nhân viên:");
                String prof = scanner.nextLine();

                System.out.print("Mời bạn nhập vị trí của nhân viên:");
                String level = scanner.nextLine();

                System.out.print("Mời bạn nhập lương nhân viên:");
                int payment = Integer.parseInt((scanner.nextLine()));
                employeeList.get(i).setName(name);
                employeeList.get(i).setDayOfBirth(dayOfBirth);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setSoCmnd(soCMND);
                employeeList.get(i).setPhoneNumber(phoneNumber);
                employeeList.get(i).setEmail(enmail);
                employeeList.get(i).setProf(prof);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setPayment(payment);
                break;
            }
        }

    }

    @Override
    public void delete() {
        System.out.println("Mời bạn lựa chọn mã ID nhân viên cần xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (idDelete == employeeList.get(i).getId()) {
                employeeList.remove(i);
            }
        }
    }
    public static void search(){

    }
}
