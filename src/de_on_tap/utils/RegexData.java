package de_on_tap.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    public static String checkStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

//    public static String checkDay(String temp, String regex) {
//        boolean check = true;
//        do {
////            try {
////                if (Pattern.matches(regex, temp)) {
////                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
////                    LocalDate thoiGianBaoHanh = LocalDate.parse(temp, dateTimeFormatter);
////                    LocalDate thisDay = LocalDate.now();
////                    int thoiGianBaoHanh = Period.between(baoHanh).getYears();
//           String thoiGianBaoHanh;
//                    if ( thoiGianBaoHanh > 0) {
//                        check = false;
//                    } else if (thoiGianBaoHanh > 730){
//                        throw new IllegalArgumentException("Thời gian bảo hành không quá 730 ngày");
//                    }
//
//                } else {
//                    throw new IllegalArgumentException("Người dùng nhập sai định dạng. Mời nhập lại theo định dạng dd/mm/yyyy! ");
//
//                }
//            } catch (Exception e) {
//                temp = scanner.nextLine();
//            }
//        } while (check);
//        return temp;
//    }
}
