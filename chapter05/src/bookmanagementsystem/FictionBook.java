package bookmanagementsystem;

public class FictionBook extends Book{
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public FictionBook(String name, String author, int price, int ISBN, String level) {
        super(name, author, price, ISBN);
        this.level = level;
    }

    @Override
    public String toString() {
        return "FictionBook{" +
                "level='" + level + '\'' +
                ", name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", ISBN=" + getISBN() + "}";
    }
}
