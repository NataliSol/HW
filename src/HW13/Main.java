package HW13;


public class Main {
    public static void main(String[] args) {
        Validator userNameValidator = s -> s.length() > 3;
        Validator emailValidator = s -> s.contains("@");
        Validator passwordValidator = s -> s.length() > 8|| s.matches(".*\\d.*");

        ValidationService service = new ValidationService();

        String user = "user1";
        String us = "us";
        String test_test_com = "test@test.com";
        String test = "test";

        System.out.println("\"" + user + "\"" + " is valid: " + service.validate(user, userNameValidator));
        System.out.println("\"" + us + "\"" + " is valid: " + service.validate(us, emailValidator));
        System.out.println("\"" + test_test_com + "\"" + " is valid: " + service.validate(test_test_com, passwordValidator));
        System.out.println("\"" + test + "\"" + " is valid: " + service.validate(test, passwordValidator));
    }
}
