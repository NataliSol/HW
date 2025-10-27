package HW13;

public class ValidationService {
    public  boolean validate (String value, Validator validator){
        return validator.validate(value);
    }
}
