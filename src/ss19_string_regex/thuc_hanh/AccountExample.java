package ss19_string_regex.thuc_hanh;

public class AccountExample {
    public static  boolean checkAcount ( String account) {
        String accounts="^[_a-z0-9]{6,}$";
        return account.matches(account);
    }
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        for (String str: validAccount
             ) {
            boolean check=checkAcount(str);
            System.out.println("Account is : " + str + "is valid:" + check);
        }
        for (String str1: invalidAccount
             ) {
            boolean chekc1=checkAcount(str1);
            System.out.println("Account is:" + str1+"is invalid :" + chekc1);
        }
    }
}
