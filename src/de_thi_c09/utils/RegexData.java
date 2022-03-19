package de_thi_c09.utils;

import java.util.Scanner;

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
}
