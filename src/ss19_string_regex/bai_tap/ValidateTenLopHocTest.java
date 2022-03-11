package ss19_string_regex.bai_tap.validate_so_dien_thoai;

public class ValidateTenLopHocTest {
    private static ValidateTenLopHoc validateTenLopHoc;
    public static final String[] validClass = new String[]{"C1234G", "D2468H", "E7890I", "A2408M"};
    public static final String[] invalidClass = new String[]{"C1234G", "D2468H", "E7890I", "A2408M", "456789", "T1234G"};

    public static void main(String[] args) {
        validateTenLopHoc = new ValidateTenLopHoc();
        for (String str : validClass
        ) {
            boolean checkClass = validateTenLopHoc.validate(str);
            System.out.println("Class is " + str + "is valid :" + checkClass);
        }
        for (String str1 : invalidClass
        ) {
            boolean checkClass1 = validateTenLopHoc.validate(str1);
            System.out.println("Class is :" + str1 + "is invalid" + checkClass1);
        }
    }
    }

