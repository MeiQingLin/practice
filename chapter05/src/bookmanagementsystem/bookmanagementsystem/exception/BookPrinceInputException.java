package bookmanagementsystem.exception;

/**
 * 针对管理员增添书籍时,输入的书籍价格不符合要求
 */
public class BookPrinceInputException extends Exception{
    public BookPrinceInputException() {
    }

    public BookPrinceInputException(String message) {
        super(message);
    }
}
