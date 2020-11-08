package shy.exception;

/**
 * 当用户的姓名出现问题抛出异常
 */
public class NameException extends myException {
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
