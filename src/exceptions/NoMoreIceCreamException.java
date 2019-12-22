package exceptions;

public class NoMoreIceCreamException extends RuntimeException {


    // in deze klasse wordt de exceptions opgevangen

    // constructors

    public NoMoreIceCreamException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
}




