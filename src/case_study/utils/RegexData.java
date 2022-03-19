package case_study.utils;

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
    public static String checkAge(String temp, String regex){
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag){
            try {
                if (Pattern.matches(regex, temp)){
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current>18&&current<100){
                        flag = false;
                    } else {
                        throw new AgeException("age is more than 18 and less than 100");
                    }
                } else {
                    throw new AgeException("wrong formating");
                }

            } catch (AgeException e){
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}

