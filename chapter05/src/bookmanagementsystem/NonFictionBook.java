package bookmanagementsystem;

public class NonFictionBook extends Book{
    private String topic;

    public NonFictionBook(String name, String author, int price, int ISBN, String topic) {
        super(name, author, price, ISBN);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" +
                "topic='" + topic + '\'' +
                ", name='" + getName() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", ISBN=" + getISBN()  + "}";
    }
}
