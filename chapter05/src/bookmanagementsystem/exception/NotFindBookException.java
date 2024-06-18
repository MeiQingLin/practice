package bookmanagementsystem.exception;

/**
 * 针对没有找到图书异常情况
 */
public class NotFindBookException extends Exception{
    public NotFindBookException(String message) {
        super(message);
    }

    public NotFindBookException() {
    }
}
