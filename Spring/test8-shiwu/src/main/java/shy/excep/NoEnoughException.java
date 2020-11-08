package shy.excep;


//自定义的运行时异常
public class NoEnoughException extends RuntimeException{
    public NoEnoughException() {
        super();
    }

    public NoEnoughException(String message) {
        super(message);
    }
}
