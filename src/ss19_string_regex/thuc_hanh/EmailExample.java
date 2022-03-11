package ss19_string_regex.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    public static boolean checkEmail(String account) {
        String email = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return account.matches(email);
    }

    public static final String[] validEmail = new String[]{ "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{ "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        for (String str : validEmail) {
            boolean check = checkEmail(str);
            System.out.println("The account: " + str + "isValid: " + check);
        }
        for (String str1: invalidEmail
             ) {
            boolean check1=checkEmail(str1);
            System.out.println("THe account :" + str1 + "is invalid : " + check1);
        }
    }
}
