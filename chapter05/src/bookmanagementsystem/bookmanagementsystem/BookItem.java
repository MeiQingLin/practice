package bookmanagementsystem;

public class BookItem implements Lendable, Comparable{
    //图书
    private Book book;

    //图书状态 true表示未借出 false表示已借出
    boolean condition;

    public BookItem() {
    }

    public BookItem(Book book, boolean condition) {
        this.book = book;
        this.condition = condition;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public int compareTo(Object o) {
        return book.getISBN() - ((BookItem)o).getBook().getISBN();
    }

    //借阅
    @Override
    public void borrowBook() {
        System.out.println("图书借阅成功!");
        condition = false;
    }

    //归还
    @Override
    public void returnBook() {
        System.out.println("图书归还成功!");
        condition = true;
    }
}
