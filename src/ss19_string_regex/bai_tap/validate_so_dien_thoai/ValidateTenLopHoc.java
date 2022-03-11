package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateTenLopHoc {
    private static String CLASS_REGEX="^[CAP]{1}\\d{4}[GHIKLM]$";
    public ValidateTenLopHoc() {
    }
    public boolean validate(String regex) {
        Pattern pattern=Pattern.compile(CLASS_REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }


}
