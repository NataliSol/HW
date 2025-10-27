package HW13;

@FunctionalInterface
public interface Validator {
    boolean validate(String value);

    default void author(){
        System.out.println(" this interface created by");
    }
}
