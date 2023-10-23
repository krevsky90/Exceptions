package app;

/**
 * Created by krevsky on 02.01.2015.
 */
public class Exception1 extends Exception {
    private String message;

    public Exception1(String message) {
        this.message = message;
    }

    public Exception1(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
