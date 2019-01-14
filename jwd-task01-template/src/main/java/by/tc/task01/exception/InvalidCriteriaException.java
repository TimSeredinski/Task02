package by.tc.task01.exception;

public class InvalidCriteriaException extends ApplicationException {

    public InvalidCriteriaException() {
        super();
    }

    public InvalidCriteriaException(String message) {
        super(message);
    }

    public InvalidCriteriaException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCriteriaException(Throwable cause) {
        super(cause);

    }
}
