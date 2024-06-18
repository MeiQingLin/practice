package bookmanagementsystem.exception;

/**
 * 针对管理员增添书籍时,输入的书籍受众人群不符合要求
 */
public class BookLevelInputException extends Exception{
    public BookLevelInputException() {
    }

    public BookLevelInputException(String message) {
        super(message);
    }
}
