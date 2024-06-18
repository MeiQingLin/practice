package bookmanagementsystem.exception;

/**
 * 针对用户输入非法的图书编号
 */
public class IllegalISBNException extends Exception{

    public IllegalISBNException() {
    }

    public IllegalISBNException(String message) {
        super(message);
    }
}
