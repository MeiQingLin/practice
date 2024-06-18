package bookmanagementsystem.exception;

/**
 * 针对管理员增添书籍时,输入的书籍主题不符合要求
 */
public class BookTopicInputException extends Exception{
    public BookTopicInputException() {
    }

    public BookTopicInputException(String message) {
        super(message);
    }
}
