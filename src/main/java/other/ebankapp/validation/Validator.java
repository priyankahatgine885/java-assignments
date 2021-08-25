package other.ebankapp.validation;
public class Validator {
    private static final String NAME_PATTERN = "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}";
    public static boolean validateName(String name) {
        return name.matches(NAME_PATTERN);
    }
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static boolean validateEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }
    private static final String PHONE_PATTERN = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
    public static boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_PATTERN);
    }
}

