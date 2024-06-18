package bookmanagementsystem.exception;

/**
 * 针对于管理员增添书籍时输入书籍类型不符合要求
 */
public class BookTypeInputException extends Exception{
    public BookTypeInputException() {
    }

    public BookTypeInputException(String message) {
        super(message);
    }
}
