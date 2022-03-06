//package collection_review.utils;
//
//
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Validate {
//    Scanner scanner = new Scanner(System.in);
//
//    public String birthDate() {
//        String birthDate;
//        do {
//            System.out.println("Enter date of birth in 'DD/MM/YYYY' format");
//            birthDate = scanner.nextLine();
//        } while (!Pattern.matches("^(0[1-9]|[12][\\d]|3[01])/(0[1-9]|1[0-2])/(19[2-9][\\d]|200[0-3])$", birthDate));
//        return birthDate;
//    }
//
//    public String numPhone() {
//        try {
//            while (true) {
//                String numPhone = scanner.nextLine();
//                final String PHONE = "^\\d{2}[.-]{1}[0-9&&[0]]{1}\\d{9}$";
//                System.out.println("Phone is number with minimum 10 characters ");
//                Pattern pattern = Pattern.compile(PHONE);
//                Matcher matcher = pattern.matcher(numPhone);
//                boolean check = matcher.matches();
//                System.out.println(numPhone + ":" + check);
//            }
//        } catch (Exception e) {
//            System.out.println("Error");
//        }
//    }
//    public String email() {
//        String email;
//        while (true) {
//            System.out.println("Please enter your email");
//            email=scanner.nextLine();
//            Pattern pattern= Pattern.compile("^[_A-Za-z0-9-+]+(\\\\.[_A-Za-z0-9-]+)*@");
//            if (pattern.matcher(email).find()) {
//                break;
//            }else {
//                System.out.println("Email: with format @");
//            }
//        }
//        return email;
//    }
//    public Double yearOfExperience() {
//        while (true) {
//            try {
//                System.out.println("Enter years of experience");
//                double yearOfExperience=Double.parseDouble(scanner.nextLine());
//                if (yearOfExperience>0 && yearOfExperience<100) {
//                    return yearOfExperience;
//                }else if (yearOfExperience<0 || yearOfExperience >100) {
//                    System.out.println("enter numbers greater than 0 and less than 20");
//                }else {
//                    throw new Exception();
//                }
//            } catch (Exception exception) {
//                System.out.println("Please can't type");
//            }
//        }
//    }
//}
//
