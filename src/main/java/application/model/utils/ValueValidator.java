package application.model.utils;

public class ValueValidator {

    private ValueValidator() {
    }

    public static <T> T requiredNotNull(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}